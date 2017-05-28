/**
 * Created by cuongbui on 5/28/17.
 */

"use strict";

function Person() {
    this.firstName = "undefine";
    this.lastName = "undefine";
    this.getFullName = function () {
        return this.firstName + " " + this.lastName;
    }
}

var person1 = new Person();
person1.firstName = "Cuong";
person1.lastName = "Bui Manh";
console.log(person1.getFullName());

// --> Cung la function, nhung neu minh dung tu khoa new Person()
// --> Javascript hieu la class
// --> Neu call theo kieu Person()
// --> Java script hieu la function


// Class use get set properties
function Animal() {
    var _name;
    var _age;

    Object.defineProperties(this, {
        Name: {
            get: function () {
                return _name
            },
            set: function (value) {
                _name = value;
            }
        },

        Age: {
            get: function () {
                return _age;
            },
            set: function (value) {
                _age = value;
            }
        }
    });
}

var animal = new Animal();
animal.Name = "Dog";
animal.Age = 5;
console.log(animal.Name + " " + animal.Age);