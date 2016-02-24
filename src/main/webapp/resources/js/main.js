$(document).ready(function () {
    onStart();
    addEvents();
});

var onStart = function () {
    console.log("Application is start now...");
};

function clickForm() {
    $('.result').html('');
    $('.alert').html('');
    if ($("#firstdigit").val() != '' && $("#secondigit").val() != '') {
        var data = {
            firstdigit: $("#firstdigit").val(),
            secondigit: $("#secondigit").val(),
            operation: $(".operationSelection").text()
        };
        $.ajax({
            url: $hostRoot + "calc",
            type: 'post',
            dataType: 'json',
            contentType: 'application/json',
            data: JSON.stringify(data),
            success: function (calcDTO) {
                if (calcDTO.message != null) {
                    //alert message
                    $('#centralContainer').append('<div class="alert">' + calcDTO.message + '</div>');
                }
                else {
                    $('.result').text(calcDTO.result);
                }
            },
            error: function (error) {
                console.log("ERROR");
            }
        });
    }
};
var addEvents = function () {
    //change operation on button click
    $(".operationButton").on('click', function () {
        var oper = $(this).text();
        $('.operationSelection').text(oper);
    });
};


