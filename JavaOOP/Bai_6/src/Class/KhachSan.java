package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
	private ArrayList<KhachTro> ds222;

	public KhachSan() {
		ds222 = new ArrayList<KhachTro>(10);
	}

	public void themKhachTro(KhachTro kt) {
		ds222.add(kt);
	}

	public void nhapDanhSach(Scanner sc) {
		KhachTro khach;

		System.out.print("Nhap vao so luong khach: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao thong tin khach tro:");
		for (int i = 0; i < n; i++) {
			System.out.println("Khach tro thu " + (i + 1) + " la:");
			khach = new KhachTro();
			khach.nhapThongTin(sc);
			themKhachTro(khach);
		}
	}

	public void hienThiDanhSach() {
		for (KhachTro khach : ds222) {
			khach.hienThiThongTin();
		}
	}

	public double tinhTien(int CMND) {
		double tien = 0;

		for (KhachTro khach : ds222) {
			if (khach.getCMND222() == CMND) {
				tien = khach.getSoNgayTro222() * khach.getGiaPhong222();
			}
		}

		return tien;
	}
}
