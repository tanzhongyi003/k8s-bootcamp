/**
 * Created by gongyingxing on 16/12/16.
 */
$("input")
    .focus(function () {
        $(".dz-pop-bg").show();
    })
    .blur(function () {
        $(".dz-pop-bg").hide();
    });

$(".dz-btn").click(function () {
    if ($('input').val()) {
        if ($('input').val() < 98) {
            $('.dz-pop-middle').html('未找到符合您全款预算的房源，建议您的全款预算不低于98万!');
            $(".dz-btn").on("click", function () {
                $("#demo-1").show();
                $('.dz-pop-head').css("background-color", "#1abc9c");
            });
            $(".dz-pop-comfirm").on("click", function () {
                $("#demo-1").hide();
            });
        } else if ($('input').val().length > 8) {
            $('.dz-pop-middle').html('您的输入超出8位数值范围或输入为非数值，请重新输入!');
            $(".dz-btn").on("click", function () {
                $("#demo-1").show();
                $('.dz-pop-head').css("background-color", "#1abc9c");
            });
            $(".dz-pop-comfirm").on("click", function () {
                $("#demo-1").hide();
            });
        } else {
            window.location.href = "step2.html?account=" + $('input').val();
        }
    } else {
        $('.dz-pop-middle').html('请输入您的全款预算!');
        $(".dz-btn").on("click", function () {
            $("#demo-1").show();
            $('.dz-pop-head').css("background-color", "#1abc9c");
        });
        $(".dz-pop-comfirm").on("click", function () {
            $("#demo-1").hide();
        });
    }
});


