/**
 * Created by cuongbui on 5/28/17.
 */

var name = "GlobalName";
function WhoIsThis() {
    var name = "LocalName";
    console.log("name: " + name);
    console.log("this.name: " + this.name);

    this.display = function () {
        console.log("name: " + name);
        console.log("this.name: " + this.name);
    }
}

// WhoIsThis(); // --> 'this': is window

var object1 = new WhoIsThis();
object1.name = "Bui Manh Cuong";
object1.display();

/////////////////////////////////////////////////////////
console.log("==== 'this' in context callback function");
function someFunction(callbackFunction) {
    var myVar = 200;
    callbackFunction();
}

var objContainCallbackFunction = {
    name: "Bui Manh Cuong",
    functionCallback: function () {
        console.log(this.name);
    }
};

someFunction(objContainCallbackFunction.functionCallback); // Here 'this' is window
someFunction(objContainCallbackFunction.functionCallback.bind(objContainCallbackFunction)); // Here 'this' is objContainCallbackFunction