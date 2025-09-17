package Class;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
	private ArrayList<HoDan> dshd222;

	public KhuPho() {
		dshd222 = new ArrayList<HoDan>(10);
	}

	public void themHoDan(HoDan hoDan) {
		dshd222.add(hoDan);
	}

	public void nhapDanhSach(Scanner sc) {
		HoDan hoDan;

		System.out.print("Nhap vao so ho dan: ");
		int soHoDan = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao thong tin cho tung ho dan:");
		for (int i = 0; i < soHoDan; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			hoDan = new HoDan();
			hoDan.nhapThongTin(sc);
			themHoDan(hoDan);
		}
	}

	public void hienThiDanhSach() {
		int n = dshd222.size();

		for (int i = 0; i < n; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			dshd222.get(i).hienThiThongTin();
		}
	}

	// ham tim kiem thong tin
	public void timKiemThongTin() {
		Date now = new Date();
		int namHienTai = now.getYear() + 1900;

		Nguoi[] dstv = null;

		for (HoDan hoDan : dshd222) {
			dstv = hoDan.getList222();
			for (int i = 0; i < hoDan.getSoNguoi222(); i++) {
				if (namHienTai - (dstv[i].getNgaySinh222().getYear() + 1900) == 80) {
					hoDan.hienThiThongTin();
				}
			}
		}
	}
}
