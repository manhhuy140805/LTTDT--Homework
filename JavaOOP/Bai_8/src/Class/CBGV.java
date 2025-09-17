package Class;

import java.util.Scanner;

public class CBGV extends Nguoi {
	private double luongCung222;
	private double thuong222;
	private double phat222;
	private double luongThucLinh222;

	public CBGV() {

	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap luong cung: ");
		luongCung222 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap thuong: ");
		thuong222 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap phat: ");
		phat222 = sc.nextDouble();
		sc.nextLine();

		luongThucLinh222 = luongCung222 + thuong222 - phat222;
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLuong cung: " + luongCung222);
		System.out.println("\tThuong: " + thuong222);
		System.out.println("\tPhat: " + phat222);
		System.out.println("\tLuong thuc linh: " + luongThucLinh222);
	}

	public double getLuongThucLinh222() {
		return luongThucLinh222;
	}
}
