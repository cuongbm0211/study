/**
 * Created by cuongbui on 6/3/17.
 */
$(document).ready(function () {
    $('#btnSubmit').on('click', function () {
        var selectedLanguage = $('#skill option:selected');
        $('#divResult').html("You select: " + selectedLanguage.val());
    });

    $('#btnMultiSelect').click(function () {
        var selectedLanguages = $('#multiSelectedSkills option:selected');
        if (selectedLanguages.length > 0) {
            var message = "";
            selectedLanguages.each(function () {
                message += $(this).val();
            });
            $('#divResult').html(message);
        }
    });
});
