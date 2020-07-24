package dongcode.shape;

import java.util.Scanner;

class Ellipse extends Shape {

    int a; //truc lon
    int b; //truc be

    @Override
    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai 2 truc: ");
        a = sc.nextInt(); b = sc.nextInt();
        if( b > a ){
            int m = b;
            b = a;
            a = m;
        }
    }

    @Override
    void xuat() {
        System.out.println("Elip, co 2 truc a = " + a + ", b = " + b);
    }

    @Override
    double tinhDienTich() {
        return ( 3.141295 * a * b / 4 ) ;
    }

    @Override
    String loaiShape() {
        return "ellipse";
    }
}
