/**
 * Created by cuongbui on 6/3/17.
 */


$(document).ready(function () {
    $('#btnSubmit').on('click', function () {
        var rdoChecked = $('input[type="radio"]:checked');
        if (rdoChecked.length > 0) {
            $('#divResult').text(rdoChecked.length + " radio checked");
            $('#divResult').append(' Value select is: ' + rdoChecked.val());
        } else {
            $('#divResult').text("No radio checked");
        }
    });
});