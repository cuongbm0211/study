/**
 * Created by cuongbui on 5/23/17.
 */

var date1 = new Date();
console.log(date1);
console.log("date1.getYear()" + date1.getYear());
console.log("date1.getFullYear()" + date1.getFullYear());
console.log("date1.getMonth()" + date1.getMonth());
console.log("date1.getDay()" + date1.getDay());


// Timestamp
var date2 = new Date(5000);
console.log(date2);

var date3 = new Date("5/2/2017"); // month/day/year
console.log(date3);

var date4 = new Date("January-2017-2");
console.log(date4);

// Date utc iso
var date5 = new Date("2015-02-10T12:50:50.5000z");
console.log(date5);
