/**
 * Created by cuongbui on 5/27/17.
 */

var nullValue = null;

if (nullValue) { // If have data
    console.log("condition condition ifNull");
    // Null is treat is false
} else {
    console.log("nullValue is null");
}


// Undefine
var undefineValue;
if (undefineValue) { // If have data
    console.log("Value is already define");
} else {
    console.log("Value undefine");
}

