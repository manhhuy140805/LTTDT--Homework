package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	private String hoTen222;
	private Date ngaySinh222;
	private String ngheNghiep222;

	public Nguoi() {}

	public Nguoi(String hoTen, Date ngaySinh, String ngheNghiep) {
		this.hoTen222 = hoTen;
		this.ngaySinh222 = ngaySinh;
		this.ngheNghiep222 = ngheNghiep;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen222 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh222 = strToDate(strDate);
		System.out.print("\tNhap nghe nghiep: ");
		ngheNghiep222 = sc.nextLine();
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
		System.out.println("\tNgay sinh: " + dateToString(ngaySinh222));
		System.out.println("\tNghe nghiep: " + ngheNghiep222);
	}

	private String dateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		String strDate = sdf.format(date);

		return strDate;
	}

	public Date getNgaySinh222() {
		return ngaySinh222;
	}
}
