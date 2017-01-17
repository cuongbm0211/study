/**
 * Created by CuongBM on 1/13/2017.
 */
var http = require("http");
var fs = require("fs");

http.createServer(function (req, res) {
    res.writeHead(200, {"content-type": "text/html"});

    var data = fs.readFileSync(__dirname + "/index.html");
    res.end(data);
}).listen(8888);
