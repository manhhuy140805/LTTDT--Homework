package Class;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
	private String mon1_222;
	private String mon2_222;
	private String mon3_222;

	public KhoiA() {}

	public KhoiA(String mon1, String mon2, String mon3) {
		this.mon1_222 = mon1;
		this.mon2_222 = mon2;
		this.mon3_222 = mon3;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap mon 1: ");
		mon1_222 = sc.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2_222 = sc.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3_222 = sc.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: " + mon1_222 + " - " + mon2_222 +
				" - " + mon3_222);
	}
}
