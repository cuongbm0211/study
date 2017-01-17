/**
 * Created by CuongBM on 1/13/2017.
 */
var person = {
    ho: "Bui",
    ten: "cuong",
    chaomung : function () {
        console.log("Hello: " + this.ho + " " + this.ten);
    }
}

// Call method, tuong tu nhu static trong java
person.chaomung();

console.log("Ho: " + person["ho"]);


