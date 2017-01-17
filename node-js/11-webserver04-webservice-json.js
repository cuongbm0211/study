/**
 * Created by CuongBM on 1/13/2017.
 */

// Su dung pipe
var http = require("http");
var fs = require("fs");

http.createServer(function (req, res) {
    res.writeHead(200, {"content-type": "application/json"});

    var obj = {
        ho: "Bui",
        ten: "Cuong"
    }

    res.end(JSON.stringify(obj));
}).listen(8888);
