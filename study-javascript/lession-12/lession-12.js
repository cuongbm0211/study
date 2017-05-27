/**
 * Created by cuongbui on 5/28/17.
 */

var unDefineVariable;

try {
    unDefineVariable;

    var result = 1 + unDefineVariable;
    console.log(result);
} catch (e) {
    console.log("Have error when call unDefineVariable"); // This message now show
    // Only exception when call method, not variable
}


// Throw
try {
    throw "Error message";
} catch (e) {
    console.log(e);
}

// Throw object message
try {
    throw {
        'error-code': 1234,
        'error-message': "Balance is < 0"
    }
} catch (e) {
    console.log(e);
}




















