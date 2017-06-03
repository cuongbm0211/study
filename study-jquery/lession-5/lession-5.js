/**
 * Created by cuongbui on 6/3/17.
 */

$(document).ready(function () {
   $('#btnSubmit').on('click', function () {
       var chkChecked = $('input[type="checkbox"]:checked');
       if (chkChecked.length > 0) {
           $('#divResult').html(chkChecked.length + " checked <br />");
           chkChecked.each(function () {
               $('#divResult').append($(this).val() + "<br />")
           });
       } else {
           $('#divResult').html("No checkbox is checked");
       }
   });
});
