package Class;

import java.util.Scanner;

public class PhanSo {
    public int tu222;
    public int mau222;

    private Scanner sc = new Scanner(System.in);

    public PhanSo(int tu, int mau) {
        this.tu222 = tu;
        this.mau222 = mau;
    }

    public PhanSo() {
        this.tu222 = 0;
        this.mau222 = 1;
    }

    public void nhapPhanSo() {
        do {
            System.out.print("Nhap tu so: ");
            this.tu222 = sc.nextInt();
            System.out.print("Nhap mau so: ");
            this.mau222 = sc.nextInt();

            if (mau222 == 0) {
                System.out.println("Mau so khong duoc bang 0! Moi nhap lai.");
            }
        } while (this.mau222 == 0);
    }

    public void xuatPhanSo() {
        if (mau222 == 1) {
            System.out.println(tu222);
        } else {
            System.out.println(tu222 + "/" + mau222);
        }
    }

    private int UCLN(int a, int b) {
        if (b == 0) return a;
        return UCLN(b, a % b);
    }

    public void rutGon() {
        int ucln = UCLN(Math.abs(tu222), Math.abs(mau222));
        tu222 /= ucln;
        mau222 /= ucln;
        if (mau222 < 0) {
            tu222 = -tu222;
            mau222 = -mau222;
        }
    }

    public PhanSo cong(PhanSo b) {
        PhanSo kq = new PhanSo();
        kq.tu222 = this.tu222 * b.mau222 + b.tu222 * this.mau222;
        kq.mau222 = this.mau222 * b.mau222;
        kq.rutGon();
        return kq;
    }

    public PhanSo tru(PhanSo b) {
        PhanSo kq = new PhanSo();
        kq.tu222 = this.tu222 * b.mau222 - b.tu222 * this.mau222;
        kq.mau222 = this.mau222 * b.mau222;
        kq.rutGon();
        return kq;
    }

    public PhanSo nhan(PhanSo b) {
        PhanSo kq = new PhanSo();
        kq.tu222 = this.tu222 * b.tu222;
        kq.mau222 = this.mau222 * b.mau222;
        kq.rutGon();
        return kq;
    }

    public PhanSo chia(PhanSo b) {
        PhanSo kq = new PhanSo();
        kq.tu222 = this.tu222 * b.mau222;
        kq.mau222 = this.mau222 * b.tu222;
        kq.rutGon();
        return kq;
    }
}

