package Class;

import java.util.Scanner;

public class Nguoi {
	protected String hoTen222;
	protected String ngaySinh222;
	protected String queQuan222;

	public Nguoi() {}

	public Nguoi(String hoTen, String ngaySinh, String queQuan) {
		this.hoTen222 = hoTen;
		this.ngaySinh222 = ngaySinh;
		this.queQuan222 = queQuan;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen222 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh222 = sc.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan222 = sc.nextLine();
	}

	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen222);
		System.out.println("\tNgay sinh: " + ngaySinh222);
		System.out.println("\tQue quan: " + queQuan222);
	}
}
