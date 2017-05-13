// JavaScript source code
$(document).ready(function(){

$("#cars").change(function() {
    // Pure JS
    var selectedVal = this.value;
    var selectedText = this.options[this.selectedIndex].text;
    var Message = selectedText + " will cost you 35 lakhs";

alert(Message);

    // jQuery
//    var selectedVal = $(this).find(':selected').val();
//    var selectedText = $(this).find(':selected').text();
});

});