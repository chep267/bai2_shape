package dongcode.shape;

import java.util.Scanner;

class circle extends Shape {

    float r; // ban kinh

    @Override
    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai ban kinh: ");
        r = sc.nextInt();
    }

    @Override
    void xuat() {
        System.out.println("Hinh tron, co ban kinh r=" + r);
    }

    @Override
    double tinhDienTich() {
        return ( 3.141295 * r * r );
    }

    @Override
    String loaiShape() {
        return "circle";
    }

}
