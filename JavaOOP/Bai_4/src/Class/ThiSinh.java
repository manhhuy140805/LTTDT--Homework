package Class;

import java.util.Scanner;

public class ThiSinh {
	// thuoc tinh
	private int soBD222;
	private String hoTen222;
	private String diaChi222;
	private String dienUuTien222;

	public ThiSinh() {}

	public ThiSinh(int soBD, String hoTen, String diaChi, String dienUuTien) {
		this.soBD222 = soBD;
		this.hoTen222 = hoTen;
		this.diaChi222 = diaChi;
		this.dienUuTien222 = dienUuTien;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so bao danh: ");
		soBD222 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen222 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi222 = sc.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien222 = sc.nextLine();
	}

	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBD222);
		System.out.println("\tHo ten: " + hoTen222);
		System.out.println("\tDia chi: " + diaChi222);
		System.out.println("\tDien uu tien: " + dienUuTien222);
	}

	public int getSoBD222() {
		return soBD222;
	}
}
