package dongcode.shape;

import java.util.Scanner;

class square extends Shape {
    int a; // canh hinh vuong

    @Override
    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap do dai canh: ");
        a = sc.nextInt();
    }

    @Override
    void xuat() {
        System.out.print("\nHinh vuong, canh a="+a);
    }

    @Override
    double tinhDienTich() {
        return a*a;
    }

    @Override
    String loaiShape() {
        return "square";
    }

}
