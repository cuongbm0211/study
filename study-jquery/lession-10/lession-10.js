/**
 * Created by cuongbui on 6/4/17.
 */

$(document).ready(function () {
    $('div').after('<b> tutorial</b>');
    // Equivalent
    // $('<b> tutorial</b>').insertAfter('div');

    // $('div').before('<b>learn </b>');
    // Equivalent
    $('<b>learn </b>').insertBefore('div');
});
