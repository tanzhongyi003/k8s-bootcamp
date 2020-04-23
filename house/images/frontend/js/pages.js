/**
 * Created by gongyingxing on 16/12/16.
 */

$(".go-back").on("click", function () {
    history.go(-1);
});

$(document).ready(function () {
    var pageId = location.search.replace('?id=', '');

    $.get('/api/house/' + pageId,
        function (response) {
            var tagList = response.tag.split(/\s+/);
            tagList.pop();
            $.each(tagList, function (index, item) {
                $tag = $('<span/>').html(item);
                $('.tag-bar').append($tag);
            });

            var headtitle = response.title.substring(0, response.title.indexOf('室') + 1);
            $('.head-title').html(headtitle);

            var $bannerImg = $('<img class="banner"/>').attr({src: response.image, onerror: "nofind();"});
            $('.main').prepend($bannerImg);

            $('.abstract').html(response.title);

            $('.totalPrice').html(response.totalPrice + '万');
            $('.houseType').html(response.houseType);
            $('.area').html(response.area + 'm<sup>2</sup>');

            $('#unitPrice').html(response.unitPrice + '/平');
            $('#residentialZone').html(response.residentialZone);
            $('#district').html(response.district);
            $('#orientation').html(response.orientation);
        }
    );

    $(".footer-left").on("click", function () {
        $('.dz-pop-head').css("background-color", "#f90");
        $('.dz-pop-head').html('预约看房');
        $("#demo-2").show();
        $(".pop-bg").show();
        $('.dz-pop-middle').html('预约看房,请咨询客服热线: 1010-9666');
        $('.dz-pop-comfirm').css("color", "#f90");
    });

    $(".footer-right").on("click", function () {
        $('.dz-pop-head').css("background-color", "#0b6");
        $('.dz-pop-head').html('咨询经纪人');
        $("#demo-2").show();
        $(".pop-bg").show();
        $('.dz-pop-middle').html('请咨询链家北京地产经纪人殷娇娇,电话号码: 15101059961');
        $('.dz-pop-comfirm').css("color", "#0b6");
    });

    $("#demo-2 .dz-pop-comfirm").on("click", function () {
        $("#demo-2").hide();
        $(".pop-bg").hide();
    });

    $("#demo-2 .dz-pop-cancel").on("click", function () {
        $("#demo-2").hide();
        $(".pop-bg").hide();
    });
});

function nofind() {
    var img = event.srcElement;
    var onErrorIndex = parseInt(Math.random() * 4);
    (function (index) {
        img.src = "../images/room_" + index + ".jpg";
    })(onErrorIndex);
}
