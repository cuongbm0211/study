/**
 * Created by CuongBM on 1/13/2017.
 */
var http = require("http");

http.createServer(abc).listen(8888);

var abc = function (req, bbbb) {
    bbbb.writeHead(200, {"Content-Type": "text/plain"});
    bbbb.end("Khoa pham.vn");
}