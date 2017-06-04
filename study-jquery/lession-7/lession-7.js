/**
 * Created by cuongbui on 6/4/17.
 */

$(document).ready(function () {
    // 1. For use $(this)
    $('li').each(function () {
        $(this).css('color', 'red');
    });

    // 2. For user 2 parameters
    $('li').each(function (index, element) {
        console.log("Index: " + index + " Element: " + $(this).text());
    });

    // 3. Implicit each
    $('li').css('color', 'green'); // ~ each()

    // 4. Caution: Should not work with DOM in each --> because impact to performance
    // 4.1 Wrong practice
    $('li').each(function () {
        // Many DOM calculation in each
        $('#divResult').html($('#divResult').html() + "<br/>" + $(this).html());
    });

    // 4.2 Best practice
    var result = "";
    $('li').each(function () {
        // Less DOM calculation
        result += $(this).html() + "<br/>";
    });
    $('#divResult').html(result);

    // 5. Method chaining
    // 5.1 Not use chaining
    $('li').css('color', 'red');
    $('li').slideUp(1000);
    $('li').slideDown(1000);
    $('li').attr('title', 'ok');

    // 5.2 Use chaining --> code more clear
    $('li').css('color', 'red')
        .slideUp(1000)
        .slideDown(1000)
        .attr('title', 'ok');


});

























