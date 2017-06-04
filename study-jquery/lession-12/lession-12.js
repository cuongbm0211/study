/**
 * Created by cuongbui on 6/4/17.
 */

$(document).ready(function () {
    // Use each to create array
    var array = [];
    $('li').each(function (index, element) {
        array.push($(element).text());
    });

    console.log(array);

    // Use map to create array
    array = $('li').map(function (index, element) {
                return $(element).text();
            });

    console.log(array);

    // Use map to create separate by '|'
    // Like similar to guava
    var test = $('li').map(function (index, element) {
        return $(element).text();
    }).get().join('|');

    console.log(test);

});
