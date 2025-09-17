package Class;

import java.util.Scanner;

public class KhachTro extends Nguoi {
	private int soNgayTro222;
	private String loaiPhong222;
	private double giaPhong222;

	public KhachTro() {

	}

	public KhachTro(String hoTen, int CMND, int soNgayTro,
					String loaiPhong, double giaPhong) {
		this.hoTen222 = hoTen;
		this.CMND222 = CMND;
		this.soNgayTro222 = soNgayTro;
		this.loaiPhong222 = loaiPhong;
		this.giaPhong222 = giaPhong;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so ngay tro: ");
		soNgayTro222 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap loai phong: ");
		loaiPhong222 = sc.nextLine();
		System.out.print("\tNhap gia phong: ");
		giaPhong222 = sc.nextDouble();
		sc.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo ngay tro: " + soNgayTro222);
		System.out.println("\tLoai phong: " + loaiPhong222);
		System.out.println("\tGia phong: " + giaPhong222);
	}

	public int getSoNgayTro222() {
		return soNgayTro222;
	}

	public double getGiaPhong222() {
		return giaPhong222;
	}
}
