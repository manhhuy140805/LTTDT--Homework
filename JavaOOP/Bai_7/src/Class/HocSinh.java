package Class;

import java.util.Scanner;

public class HocSinh extends Nguoi {
	private String lop222;
	private String khoHoc222;
	private String kyHoc222;

	public HocSinh() {

	}

	public HocSinh(String hoTen, String lop, String khoaHoc, String kyHoc) {
		this.hoTen222 = hoTen;
		this.lop222 = lop;
		this.khoHoc222 = khoaHoc;
		this.kyHoc222 = kyHoc;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap lop: ");
		lop222 = sc.nextLine();

		System.out.print("\tNhap khoa hoc: ");
		khoHoc222 = sc.nextLine();

		System.out.print("\tNhap ky hoc: ");
		kyHoc222 = sc.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLop: " + lop222);
		System.out.println("\tKhoa hoc: " + khoHoc222);
		System.out.println("\tKy hoc: " + kyHoc222);
	}

	public String getLop222() {
		return lop222;
	}
}
