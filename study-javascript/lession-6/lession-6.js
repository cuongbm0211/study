/**
 * Created by cuongbui on 5/21/17.
 */

var strObject1 = new String('Hello string object'); // This declare not encourage
console.log(strObject1);

var strObject2 = new String('Hello string object');
console.log(strObject1 == strObject2); // Result is fail

var strTest = 'Hello string object';
console.log(strObject1 == strTest); // Result is true
console.log(strObject1 === strTest); // Result is fail

var encourageString = "Encourage string";
console.log(encourageString);

// for (i=0; i<encourageString.length; i++) {
//     console.log(strTest[i]);
// }

var number = 5555;
console.log(number.indexOf(1));