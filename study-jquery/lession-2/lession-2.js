/**
 * Created by cuongbui on 6/1/17.
 */


$(document).ready(function () {
    var btn = $('#btnClickMe');

    // Check Id selector is exist
    if (btn.length > 0) {
        btn.click(function () {
            console.log("Hello CDN");
        });
    }
});
