/**
 * Created by cuongbui on 6/4/17.
 */

$(document).ready(function () {
    $('#btnAddColor').on('click', function () {
        $('h1').addClass('color');
    });

    $('#btnRemoveColor').on('click', function () {
        $('h1').removeClass('color');
    });

    $('#btnToggleColor').on('click', function () {
        $('h1').toggleClass('color')
    });

    $('#btnHasColor').on('click', function () {
        alert($('h1').hasClass('color'));
    });

    $('#btnAddItalic').on('click', function () {
        $('h1').addClass('italic');
    });

    $('#btnRemoveAllClass').on('click', function () {
        $('h1').removeClass();
    });
});
