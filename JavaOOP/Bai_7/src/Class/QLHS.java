package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
	private ArrayList<HocSinh> dshs222;

	public QLHS() {
		dshs222 = new ArrayList<HocSinh>(10);
	}

	public void themHS(HocSinh hs) {
		dshs222.add(hs);
	}

	public void nhapDanhSachHS(Scanner sc) {
		HocSinh hs;

		System.out.print("Nhap vao so luong hoc sinh: ");
		int n = sc.nextInt();

		System.out.println("Nhap thong tin cho hoc sinh trong danh sach:");
		for (int i = 0; i < n; i++) {
			System.out.println("\tHoc sinh thu " + (i + 1) + " la:");

			hs = new HocSinh();
			hs.nhapThongTin(sc);

			themHS(hs);
		}
	}

	public void hienThiDanhSach() {
		int n = dshs222.size();
		for (int i = 0; i < n; i++) {
			System.out.println("\tHoc sinh thu " + (i + 1) + " la:");
			dshs222.get(i).hienThiThongTin();
		}
	}

	public void timKiemThongTin(int nam, String que) {
		for (HocSinh hs : dshs222) {
			if ((hs.getNgaySinh222().getYear() + 1900 == nam) &&
					(que.equals(hs.getQueQuan222()))) {
				hs.hienThiThongTin();
			}
		}
	}

	public void timKiemThongTin(String lop) {
		for (HocSinh hs : dshs222) {
			if (lop.equals(hs.getLop222())) {
				hs.hienThiThongTin();
			}
		}
	}
}
