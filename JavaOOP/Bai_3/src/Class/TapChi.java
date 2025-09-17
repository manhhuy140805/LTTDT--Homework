package Class;

import java.util.Scanner;

public class TapChi extends TaiLieu {
	private int soPhatHanh222;
	private int thangPhatHanh222;

	public TapChi() {}

	public TapChi(String maTaiLieu, String tenNXB, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.soPhatHanh222 = soBanPhatHanh;
		this.thangPhatHanh222 = thangPhatHanh;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap so phat hanh: ");
		soPhatHanh222 = sc.nextInt();
		System.out.print("\tNhap thang phat hanh: ");
		thangPhatHanh222 = sc.nextInt();
		sc.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phat hanh: " + soPhatHanh222);
		System.out.println("\tThang phat hanh: " + thangPhatHanh222);
	}
}
