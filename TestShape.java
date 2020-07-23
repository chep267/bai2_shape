package dongcode.shape;

import java.util.LinkedList;

public class TestShape {

    public static void main(String[] args) {

        LinkedList<Shape> ds = new LinkedList<>();

        Shape tamgiac = new rectangle();
        tamgiac.nhap();
        ds.add(tamgiac);



        //thong ke:
        int dem1=0, dem2=0, dem3=0, dem4 =0; double s = 0;
        for( Shape a : ds ) {
            if( a.loaiShape() == "rectangle" ){
                dem1++;
            }
            else if( a.loaiShape() == "ellipse" ){
                dem2++;
            }
            else if( a.loaiShape() == "circle" ){
                dem3++;
            }
            else if( a.loaiShape() == "square" ){
                dem4++;
            }
            s += a.tinhDienTich();
        }
        System.out.print("\nHinh tam giac: "+dem1+" hinh.");
        System.out.print("\nHinh elip: "+dem2+" hinh.");
        System.out.print("\nHinh tron: "+dem3+" hinh.");
        System.out.print("\nHinh vuong: "+dem4+" hinh.");

        //Tong dien tich cac hinh:
        System.out.print("\ntong dien tich cac hinh: "+s);
    }
}
