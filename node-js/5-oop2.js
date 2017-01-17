/**
 * Created by CuongBM on 1/13/2017.
 */
// Day la khai bao class day
function KhoaHoc(ten, giaTien) {
    this.ten = ten;
    this.giaTien = giaTien;
}

// Day la khai bao method cho class
KhoaHoc.prototype.thongTin = function () {
    console.log("Khoa hoc: " + this.ten + " Gia ca: " + this.giaTien);
}

var nodeJs = new KhoaHoc("NodeJs", 800000);
nodeJs.thongTin();
