package Class;

import java.util.Scanner;

public class KhachHang {
	protected String tenChuHo222;
	protected int soNha222;
	protected String maCongTo222;

	public KhachHang() {}

	public KhachHang(String tenChuHo, int soNha, String maCongTo) {
		this.tenChuHo222 = tenChuHo;
		this.soNha222 = soNha;
		this.maCongTo222 = maCongTo;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo222 = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha222 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo222 = sc.nextLine();
	}

	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo222);
		System.out.println("\tSo nha: " + soNha222);
		System.out.println("\tMa cong to: " + maCongTo222);
	}
}
