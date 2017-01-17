/**
 * Created by CuongBM on 1/13/2017.
 */
// Bat ke moi thu: anh, am thanh, string deu la buffer
var buffer = new Buffer("Hello", "utf-8");
console.log(buffer); // convert to buffer

console.log(buffer.toString()) // convert toString
console.log(buffer.toJSON()) ;