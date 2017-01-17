/**
 * Created by CuongBM on 1/13/2017.
 */

// Su dung pipe
var http = require("http");
var fs = require("fs");

http.createServer(function (req, res) {
    res.writeHead(200, {"content-type": "text/html"});
    fs.createReadStream(__dirname + "/index.html").pipe(res);
}).listen(8888);
