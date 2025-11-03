public class SinhVien {
    private String idSinhVien;
    private String tenSinhVien;
    private String diemDauVao;

    public SinhVien() {}

    public SinhVien(String idSinhVien, String tenSinhVien, String diemDauVao) {
        this.idSinhVien = idSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.diemDauVao = diemDauVao;
    }

    public String getIdSinhVien() {
        return idSinhVien;
    }

    public void setIdSinhVien(String idSinhVien) {
        this.idSinhVien = idSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public String getDiemDauVao() {
        return diemDauVao;
    }

    public void setDiemDauVao(String diemDauVao) {
        this.diemDauVao = diemDauVao;
    }
}
