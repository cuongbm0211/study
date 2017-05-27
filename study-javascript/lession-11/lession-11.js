/**
 * Created by cuongbui on 5/27/17.
 */

function showMessage(firstName, lastName) {
    console.log("Hello " + firstName + " " + lastName);
}

showMessage();
var a;
showMessage("Cuong");
showMessage("Cuong", "Bui");
showMessage("Cuong", "Bui", "Manh");

// Check return of fuction
var returnOfFunctionShowMessage = showMessage();
console.log("returnOfFunctionShowMessage: " + returnOfFunctionShowMessage); // Undefine

// Argument function
function testArgument(firstName, lastName) {
    // Work normally
    console.log("Hello " + arguments[0] + " " + arguments[1]);
}

// Function return function
function calculate() {
    function add(num1, num2) {
        return num1 + num2;
    }

    return add;
}

var add = calculate();
console.log(add);
console.log(add(2, 4));

// Expression function
// --> For us assign funtion to variable
var multiply = function multiplyFunction(num1, num2) {
    return num1 * num2;
}
console.log(multiply(2, 4));

// Anonymous function
// --> function without name
var anonymousFunction = function (name) {
    console.log("Hello ", name);
}
anonymousFunction("Cuong");


// Nested function
// --> In function can have multi function, but outer cannot call this function
// --> I can see is very similar to object, except cannot call nested function from outer
function parentFunction() {
    var properties1;
    var properties2;

    function nestedFunction1() {

    }

    function nestedFunction2() {

    }

    function nestedFunction3() {

    }
}



























