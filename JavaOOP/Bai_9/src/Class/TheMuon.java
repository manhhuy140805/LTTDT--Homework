package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	private int soMuon222;
	private Date ngayMuon222;
	private Date hanTra222;
	private String soHieu222;

	public TheMuon() {}

	public TheMuon(int soMuon, Date ngayMuon, String soHieu) {
		this.soMuon222 = soMuon;
		this.ngayMuon222 = ngayMuon;
		this.soHieu222 = soHieu;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so muon: ");
		soMuon222 = sc.nextInt();
		sc.nextLine();

		System.out.print("\tNhap ngay muon: ");
		String strNgayMuon = sc.nextLine();
		ngayMuon222 = strToDate(strNgayMuon);

		String strNgayTra = "31-12-2020";
		hanTra222 = strToDate(strNgayTra);

		System.out.println("\tNhap so hieu: ");
		soHieu222 = sc.nextLine();
	}

	private Date strToDate(String strNgayMuon) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strNgayMuon);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo phieu muon: " + soMuon222);
		System.out.println("\tNgay muon: " + ngayMuon222);
		System.out.println("\tHan tra: " + hanTra222);
		System.out.println("\tSo hieu: " + soHieu222);
	}

	public Date getHanTra222() {
		return hanTra222;
	}
}
