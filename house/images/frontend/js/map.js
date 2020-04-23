/**
 * Created by gongyingxing on 16/12/16.
 */
$(".go-back").on("click", function () {
    history.go(-1);
});

$(document).ready(function () {
    var param = location.search.replace('?account=', '');
    $.get('/api/predict/' + param,
        function (response) {
            $("#by-local").html(response[0].district);
            $("#by-area").html('约' + response[0].area + '平');

            $("#hlg-local").html(response[1].district);
            $("#hlg-area").html('约' + response[1].area + '平');

            $("#com-local").html(response[2].district);
            $("#com-area").html('约' + response[2].area + '平');

            $(".sec1").click(function () {
                window.location.href = "step3.html?location=" + 1 + '&district='
                    + response[1].district + '&budget=' + param;
            });

            $(".sec2").click(function () {
                window.location.href = "step3.html?location=" + 2 + '&district='
                    + response[2].district + '&budget=' + param;
            });

            $(".sec3").click(function () {
                window.location.href = "step3.html?location=" + 3 + '&district='
                    + response[0].district + '&budget=' + param;
            });
        }
    )
});
