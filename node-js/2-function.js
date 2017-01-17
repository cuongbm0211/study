/**
 * Created by CuongBM on 1/13/2017.
 */

// 1.
function emptyFuntion() {
    
}

// 2.
function functionWithParam(a, b) {
    return a + b;
}
// function in js no need return value

var sum = functionWithParam(2, 3);
console.log(sum);


// 3. goi ham
// Here is functional programming
function goiHam(fn) {
    fn();
}

function hello() {
    console.log("Hello");
}

goiHam(hello);

// 4. Bien function
// Day cung la functional programming day a
var tong = function tinhTong() {
    console.log("tinh tong");
}

tong();

// Summary
// var 1 bien trong js, no co the la String, number, la 1 object function moi thu tren doi