package dongcode.shape;

import java.util.Scanner;

import static java.lang.Math.sqrt;

class rectangle extends Shape {
    int a;
    int b;
    int c;

    @Override
    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap do dai 3 canh: ");
        a = sc.nextInt(); b = sc.nextInt(); c= sc.nextInt();
    }

    @Override
    void xuat() {
        System.out.print("\nTam giac, co 3 canh a="+a+", b="+b+", c="+c);
    }

    @Override
    double tinhDienTich() {
        return sqrt( (a+b+c)*(a+b-c)*(a-b+c)*(-a+b+c))/4;
    }

    @Override
    String loaiShape() {
        return "rectangle";
    }

}
