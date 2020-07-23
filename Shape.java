package dongcode.shape;

abstract class Shape {
    Point tam;

    abstract void nhap();

    abstract void xuat();

    abstract double tinhDienTich();

    abstract String loaiShape();
}

class Point {
    int x;
    int y;

    Point(int a, int b) {
        x = a;
        y = b;
    }
}