import java.util.Scanner;

import Class.TuyenSinh;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		TuyenSinh dsTuyenSinh = new TuyenSinh();

		dsTuyenSinh.nhapDanhSach(sc);

		System.out.println("Danh sach thi sinh du thi la:");
		dsTuyenSinh.hienThiDanhSach();

		System.out.print("Nhap so bao danh can tim: ");
		int soBaoDanh = sc.nextInt();
		sc.nextLine();

		dsTuyenSinh.timKiemThiSinh(soBaoDanh);

		sc.close();
	}

}
