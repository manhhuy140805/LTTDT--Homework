import Class.PhanSo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhanSo a = new PhanSo(1, 2);
        PhanSo b = new PhanSo();

        System.out.println("Nhap phan so thu 2");
        b.nhapPhanSo();

        System.out.print("a = "); a.xuatPhanSo();
        System.out.print("b = "); b.xuatPhanSo();

        System.out.print("a + b = "); a.cong(b).xuatPhanSo();
        System.out.print("a - b = "); a.tru(b).xuatPhanSo();
        System.out.print("a * b = "); a.nhan(b).xuatPhanSo();
        System.out.print("a / b = "); a.chia(b).xuatPhanSo();
    }
}
