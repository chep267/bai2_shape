package dongcode.shape;

import java.util.Scanner;

class square extends Shape {

    int a; // canh hinh vuong

    @Override
    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai canh: ");
        a = sc.nextInt();
    }

    @Override
    void xuat() {
        System.out.println("Hinh vuong, canh a=" + a);
    }

    @Override
    double tinhDienTich() {
        return (a * a);
    }

    @Override
    String loaiShape() {
        return "square";
    }

}
