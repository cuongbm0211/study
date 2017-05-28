/**
 * Created by cuongbui on 5/28/17.
 */
"use strict";

function Person() {
    this.name = "";
    this.age = 0;

    this.getName = function() {
        console.log(this.name);
    };
}

var cuong = new Person();
cuong.name = "Bui Manh Cuong";
cuong.age = 31;
cuong.getName();

console.log(Object.keys(cuong)); // Get all properties of object, like reflection in java

for (var prop in cuong) { // For all properties on object
    console.log(prop);
}

// Get all properties descriptor
console.log(Object.getOwnPropertyDescriptor(cuong, "name"));

Object.defineProperty(cuong, "name", {
    writable: false
});
console.log(Object.getOwnPropertyDescriptor(cuong, "name"));