/**
 * Created by cuongbui on 5/28/17.
 */

"use strict"; // use strict mode at global

function useStrictModeOnFunciton() {
    "use strict";
}

// Not accept implicit declare global variable
function notAcceptImplictDeclareGlobalVariable() {
    var a = 1;
    var b = 2;
    c = a + b; // Not accept on strict mode
    console.log(c);
}
// notAcceptImplictDeclareGlobalVariable();

// Not accept 'with' keyword
function notAcceptWithKeyword() {
    // with (document) { // Not accept on strict mode
    //     write("Hello");
    // }
}

// This not accept use on function if this function not exist on object
function cannotUseThisHere() {
    console.log(this);
    // this: is window object on non-strict-mode
    // this: is undefine object on strict-mode
}
cannotUseThisHere();

// This still use on object
function thisStillUseOnObject() {
    var object = {
        showMessage: function () {
            console.log(this);
        }
    }
    object.showMessage();
}
thisStillUseOnObject();

// Javascript has way to write readonly properties (private on java)
// Javascript has way to restrict extends object (final class on java)


















