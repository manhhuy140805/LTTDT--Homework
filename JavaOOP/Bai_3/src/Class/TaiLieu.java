package Class;

import java.util.Scanner;

public class TaiLieu {
	private String maTaiLieu222;
	private String tenNXB222;
	private int soBanPhatHanh222;

	public TaiLieu() {}

	public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
		this.maTaiLieu222 = maTaiLieu;
		this.tenNXB222 = tenNXB;
		this.soBanPhatHanh222 = soBanPhatHanh;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu222 = sc.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB222 = sc.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh222 = sc.nextInt();
		sc.nextLine();
	}

	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu222);
		System.out.println("\tTen nha xuat ban: " + tenNXB222);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh222);
	}

	public String getMaTaiLieu222() {
		return maTaiLieu222;
	}
}
