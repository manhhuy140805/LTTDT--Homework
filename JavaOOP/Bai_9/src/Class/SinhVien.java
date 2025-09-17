package Class;

import java.util.Scanner;

public class SinhVien {
	protected String hoTen222;
	protected String maSV222;
	protected String ngaySinh222;
	protected String lop222;

	public SinhVien() {}

	public SinhVien(String hoTen, String maSV, String ngaySinh, String lop) {
		this.hoTen222 = hoTen;
		this.maSV222 = maSV;
		this.ngaySinh222 = ngaySinh;
		this.lop222 = lop;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen222 = sc.nextLine();

		System.out.print("\tNhap ma sinh vien: ");
		maSV222 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		ngaySinh222 = sc.nextLine();

		System.out.print("\tNhap lop: ");
		lop222 = sc.nextLine();
	}

	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen222);
		System.out.println("\tNgay sinh: " + ngaySinh222);
		System.out.println("\tMa sinh vien: " + maSV222);
		System.out.println("\tLop: " + lop222);
	}
}
