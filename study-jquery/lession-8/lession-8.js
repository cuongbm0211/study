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

    // Convert JSON to String and vice versa
    var stringObject = JSON.stringify(persons);
    $('#divResult').html(stringObject);

    var jsonObject = JSON.parse(stringObject);
    console.log(jsonObject);
});
