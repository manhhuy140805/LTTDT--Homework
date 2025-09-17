package Class;

import java.util.Scanner;

public class Sach extends TaiLieu {
	private String tacGia222;
	private int soTrang222;

	public Sach() {}

	public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh,
				String tacGia, int soTrang) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.tacGia222 = tacGia;
		this.soTrang222 = soTrang;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap tac gia: ");
		tacGia222 = sc.nextLine();
		System.out.print("\tNhap so trang: ");
		soTrang222 = sc.nextInt();
		sc.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\ttac gia: " + tacGia222);
		System.out.println("\tSo trang: " + soTrang222);
	}
}
