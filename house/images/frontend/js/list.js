/**
 * Created by gongyingxing on 16/12/16.
 */
var imgIndex = 0;

$(".go-back").on("click" , function(){
    history.go(-1);
});

function onSelectChange() {
    var params = location.search.split('&');
    var district = decodeURIComponent(params[1]).replace('district=', '');
    var budget = params[2].replace('budget=', '');
    var payload = {};
    payload.district = district;
    payload.budget = parseInt(budget);

    $('.dz-select').each(function (index, item) {
            var payloadKey = $(item).attr('name');
            var payloadValue = $(item).val();
            var flag = ['residential-zone', 'room-square', 'house-type', 'room-orientation'].indexOf(payloadValue);
            if (flag < 0) {
                payload[payloadKey] = payloadValue;
            }
        }
    );

    payload = JSON.stringify(payload);

    $.ajax({
        url: '/api/house',
        contentType: "application/json; charset=utf-8",
        dataType: 'json',
        data: payload,
        type: 'POST',
        success: succFunction
    });
    function succFunction(response) {
        $('.list-body').html('');
        $.each(response, function (index, item) {
            var title = item.title;
            var abstract = item.residentialZone + '/' + item.area + '平米/' + item.houseType + '/' + item.orientation;
            var totalPrice = item.totalPrice;
            var imageUrl = item.image;
            var $dzItemImg = $('<img class="dz-item-img"/>').attr({ src: imageUrl, onerror:"nofind();" });
            var $dzItemInfo = $(
                "<div class='dz-item-info'>" +
                "<p class='text-label'>" +
                title +
                "</p>" +
                "<p class='text-abstract'>" +
                abstract +
                "</p>" +
                "<p class='text-sum'>" +
                totalPrice +
                "</p>" +
                "</div>"
            );
            var $listItem = $('<div class="list-item">').append($dzItemImg).append($dzItemInfo);
            var $link = $('<a>').attr({ href: "step4.html?id=" + item.id }).append($listItem);
            $('.list-body').append($link);
        });
        if (!$('.list-body').is(":empty")) {
            $("body").css({"background":"url()","background-size":"cover"});
        }
    }
    if ($('.list-body').is(":empty")) {
        $("body").css({"background":"url(../images/empty_bg.jpg) no-repeat","background-size":"cover"});
    }
}

function nofind(){
    var img = event.srcElement;
    var onErrorIndex = (imgIndex++) % 4;
    (function (index) {
        img.src="../images/room_" + index + ".jpg";
    })(onErrorIndex);
}

$(function () {
    onSelectChange();
});

$(document).ready(function(){
    var params = location.search.split('&');
    var localArea = parseInt(params[0].replace('?location=', ''));
    var $hlgOptions = $(
        '<option value="residential-zone">小区</option>' +
        '<option value="融泽嘉园">融泽嘉园</option>' +
        '<option value="东亚上北中心">东亚上北中心</option>' +
        '<option value="龙华园">龙华园</option>' +
        '<option value="流星花园三区">流星花园三区</option>' +
        '<option value="首开智慧社">首开智慧社</option>' +
        '<option value="首开国风美唐综合楼">首开国风美唐综合楼</option>'
    );
    var $comOptions = $(
        '<option value="residential-zone">小区</option>' +
        '<option value="中央财经大学家属楼">中央财经大学家属楼</option>' +
        '<option value="西二旗大街39号">西二旗大街39号</option>' +
        '<option value="当代城市家园">当代城市家园</option>' +
        '<option value="智学苑">智学苑</option>' +
        '<option value="燕尚园">燕尚园</option>' +
        '<option value="宜品上层">宜品上层</option>'
    );
    var $byOptions = $(
        '<option value="residential-zone">小区</option>' +
        '<option value="北苑家园茉藜园">北苑家园茉藜园</option>' +
        '<option value="华贸城">华贸城</option>' +
        '<option value="美立方">美立方</option>' +
        '<option value="北苑家园望春园">北苑家园望春园</option>' +
        '<option value="旭辉奥都">旭辉奥都</option>' +
        '<option value="华发颐园">华发颐园</option>'
    );

    switch (localArea) {
        case 1:
            //  回龙观
            $('.location-switch').append($hlgOptions);
            break;
        case 2:
            //  西二旗
            $('.location-switch').append($comOptions);
            break;
        case 3:
            //  北苑
            $('.location-switch').append($byOptions);
            break;
    }
});
