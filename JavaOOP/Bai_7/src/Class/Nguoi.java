package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	protected String hoTen222;
	protected Date ngaySinh222;
	protected String queQuan222;

	public Nguoi() {

	}

	public Nguoi(String hoTen, Date ngaySinh, String queQuan) {
		this.hoTen222 = hoTen;
		this.ngaySinh222 = ngaySinh;
		this.queQuan222 = queQuan;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen222 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh222 = strToDate(strDate);

		System.out.print("\tNhap que quan: ");
		queQuan222 = sc.nextLine();
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
		System.out.println("\tQue quan: " + queQuan222);
	}

	public String getQueQuan222() {
		return queQuan222;
	}

	public Date getNgaySinh222() {
		return ngaySinh222;
	}
}
