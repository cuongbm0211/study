/**
 * Created by cuongbui on 5/23/17.
 */

// LITERAL
var stringArray = ["one", "two", "three", "four"];
console.log(stringArray);

var numericArray = [1, 2, 3, 4];
console.log(numericArray);

var decimalArray = [1.1, 1.2, 1.3];
console.log(decimalArray);

var booleanArray = [true, false, true];
console.log(booleanArray);

var mixArray = [1, "two", "three", 4];
console.log(mixArray);


// CONSTRUCTOR
var stringArray = new Array();
stringArray[0] = "one";
stringArray[1] = "two";
stringArray[2] = "three";
stringArray[3] = "four";
console.log(stringArray);

var numericArray = new Array(3);
numericArray[0] = 1;
numericArray[1] = 2;
numericArray[2] = 3;
console.log(numericArray);

var mixArray = new Array(1, "two", "three", 4);
console.log(mixArray);