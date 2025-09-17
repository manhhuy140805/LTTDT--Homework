package Class;

import java.util.Scanner;

public class BienLai extends KhachHang {
	private int chiSoMoi222;
	private int chiSoCu222;
	private double tien222;

	public BienLai() {}

	public BienLai(int chiSoMoi, int chiSoCu, double tien) {
		this.chiSoMoi222 = chiSoMoi;
		this.chiSoCu222 = chiSoCu;
		this.tien222 = tien;
	}

	public BienLai(String tenChuHo, int chiSoMoi, int chiSoCu, double tien) {
		this.tenChuHo222 = tenChuHo;
		this.chiSoMoi222 = chiSoMoi;
		this.chiSoCu222 = chiSoCu;
		this.tien222 = tien;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi222 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu222 = sc.nextInt();
		sc.nextLine();
		tien222 = (chiSoMoi222 - chiSoCu222) * 750;
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi222);
		System.out.println("\tChi so cu: " + chiSoCu222);
		System.out.println("\tTien: : " + tien222);
	}
}
