package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	protected String hoTen222;
	protected Date ngaySinh222;
	protected int CMND222;

	public Nguoi() {}

	public Nguoi(String hoTen, Date ngaySinh, int CMND) {
		this.hoTen222 = hoTen;
		this.ngaySinh222 = ngaySinh;
		this.CMND222 = CMND;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen222 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh222 = strToDate(strDate);
		System.out.print("\tNhap CMND: ");
		CMND222 = sc.nextInt();
	}

	private Date strToDate(String strDate) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen222);
		System.out.println("\tNgay sinh: " + ngaySinh222);
		System.out.println("\tCMND: " + CMND222);
	}

	public int getCMND222() {
		return CMND222;
	}
}
