/**
 * Created by cuongbui on 6/4/17.
 */


$(document).ready(function () {
    var persons = [{
        "id": 1,
        "name": "Cuong",
        "age": 31
    },
    {
        "id": 2,
        "name": "Thang",
        "age": 27
    }];

    $.each($(persons), function (index, element) {
        console.log(element.name);
    });
});
