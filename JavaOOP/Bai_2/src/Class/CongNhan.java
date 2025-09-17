package Class;

import java.util.Scanner;

public class CongNhan extends CanBo {
	private String bac222;

	public CongNhan() {

	}

	public CongNhan(String hoten, String ngaySinh, String gioiTinh,
					String diaChi, String bac) {
		super(hoten, ngaySinh, gioiTinh, diaChi);
		this.bac222 = bac;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap bac: ");
		bac222 = sc.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tBac: " + bac222);
	}
}
