package Class;

import java.util.Scanner;

public class CanBo {
	private String hoTen222;
	private String ngaySinh222;
	private String gioiTinh222;
	private String diaChi222;

	public CanBo() {

	}

	public CanBo(String hoten, String ngaySinh, String gioiTinh, String diaChi) {
		this.hoTen222 = hoten;
		this.ngaySinh222 = ngaySinh;
		this.gioiTinh222 = gioiTinh;
		this.diaChi222 = diaChi;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen222 = sc.nextLine();
		System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
		ngaySinh222 = sc.nextLine();
		System.out.print("\tNhap gioi tinh: ");
		gioiTinh222 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi222 = sc.nextLine();
	}

	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen222);
		System.out.println("\tNgay sinh: " + ngaySinh222);
		System.out.println("\tGioi tinh: " + gioiTinh222);
		System.out.println("\tDia chi: " + diaChi222);
	}

	public String getHoTen222() {
		return this.hoTen222;
	}
}
