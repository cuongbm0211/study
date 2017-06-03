/**
 * Created by cuongbui on 6/2/17.
 */

$(document).ready(function () {
    // For each, and use $(this)
    $('#table1 tr').each(function () {
        if ($(this).find('td:first').text() == 'C#') {
            alert($(this).html());
        }
        console.log($(this).html());
    });

    $('[data-redirect]').addClass('my-border');

    $('[data-redirect="linkhay.com"]').css('background-color', 'red');

    // Get information in html 5
    // We use in current system
    console.log("Get data in html 5: " + $('#idGetData').data('redirect'));

});
