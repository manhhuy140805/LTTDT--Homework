package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
	private ArrayList<ThiSinh> dsts222;

	public TuyenSinh() {
		dsts222 = new ArrayList<ThiSinh>(10);
	}

	public void themThiSinh(ThiSinh ts) {
		dsts222.add(ts);
	}

	public void nhapDanhSach(Scanner sc) {
		ThiSinh ts;
		int chon;

		System.out.print("Nhap vao so luong thi sinh: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh thuoc khoi nao (1-KhoiA; 2-KhoiB; 3-KhoiC): ");
			chon = sc.nextInt();

			switch (chon) {
			case 1:
				ts = new KhoiA("Toan", "Ly", "Hoa");
				break;
			case 2:
				ts = new KhoiB("Toan", "Hoa", "Sinh");
				break;
			case 3:
				ts = new KhoiC("Van", "Su", "Dia");
				break;
			default:
				ts = new KhoiA("Toan", "Ly", "Hoa");
				break;
			}

			ts.nhapThongTin(sc);
			themThiSinh(ts);
		}
	}

	public void hienThiDanhSach() {
		int n = dsts222.size();
		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh thu " + (i + 1) + " la:");
			dsts222.get(i).hienThiThongTin();
		}
	}

	public void timKiemThiSinh(int soBaoDanh) {
		for (ThiSinh ts : dsts222) {
			if (ts.getSoBD222() == soBaoDanh) {
				ts.hienThiThongTin();
			}
		}
	}
}
