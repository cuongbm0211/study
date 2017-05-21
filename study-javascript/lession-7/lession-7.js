/**
 * Created by cuongbui on 5/21/17.
 */

// Declare object literal
var emptyObject = {}; // object with no properties or method

var person = {firstName: "John"}; // object with single property

console.log(person.firstName);
console.log(person["firstName"]);
console.log(emptyObject.firstName);

// Object with single method
var message = {
    showMessage : function(val) {
        console.log(val);
    }
}

message.showMessage("Hello message");

// Object with properties and method
var fullPerson = {
    firstName: "James",
    lastName: "Bond",
    age: 50,
    getFullName: function () {
        console.log("Fullname: " + this.firstName + this.lastName);
    }
}

fullPerson.getFullName();

// Declare object use constructor
var constructorObject = new Object();
constructorObject.firstName = "Cuong";
constructorObject.lastName = "Bui";
constructorObject.getFullName = function () {
    console.log(this.firstName + ' ' + this.lastName);
}
constructorObject.getFullName();

// List all properties
for (var key in constructorObject) {
    console.log(key);
}

console.log("Check hasOwnProperties: " + constructorObject.hasOwnProperty("fullName"));


// Nested object
fullPerson.address = {
    city: "Hanoi",
    country: "Vietnam"
};

console.log(fullPerson);





















