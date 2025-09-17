package Class;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
	private int soNguoi222;
	private int soNha222;
	private Nguoi[] list222;

	public HoDan() {
		list222 = new Nguoi[10];
	}

	public HoDan(String hoTen, Date ngaySinh, String ngheNghiep,
				 int soNguoi, int soNha) {
		super(hoTen, ngaySinh, ngheNghiep);
		this.soNguoi222 = soNguoi;
		this.soNha222 = soNha;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so nguoi: ");
		soNguoi222 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha222 = sc.nextInt();
		sc.nextLine();
		System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
		for (int i = 0; i < soNguoi222; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list222[i] = new Nguoi();
			list222[i].nhapThongTin(sc);
		}
	}

	public void hienThiThongTin() {
		System.out.println("\tSo nguoi: " + soNguoi222);
		System.out.println("\tSo nha: " + soNha222);
		System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
		for (int i = 0; i < soNguoi222; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list222[i].hienThiThongTin();
		}
	}

	public Nguoi[] getList222() {
		return list222;
	}

	public int getSoNguoi222() {
		return soNguoi222;
	}
}
