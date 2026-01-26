package main.session3.ASM2;
import java.util.Scanner;
public class SinhVien {
    //  Các thuộc tính (Fields)
    private String maSV;
    private String hoTen;
    private int tuoi;
    private double diemTB;

    public SinhVien() {}
    //  Constructor có đầy đủ tham số
    public SinhVien(String maSV, String hoTen, int tuoi, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diemTB = diemTB;
    }

    //  Getter và Setter cho tất cả thuộc tính
    public String getMaSV() { return maSV; }
    public void setMaSV(String maSV) { this.maSV = maSV; }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public int getTuoi() { return tuoi; }
    public void setTuoi(int tuoi) { this.tuoi = tuoi; }

    public double getDiemTB() { return diemTB; }
    public void setDiemTB(double diemTB) { this.diemTB = diemTB; }

    // Hàm nhập thông tin cho 1 sinh viên
    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhập mã SV: ");
        this.maSV = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        this.tuoi = sc.nextInt();
        System.out.print("Nhập điểm TB: ");
        this.diemTB = sc.nextDouble();
        sc.nextLine(); // Xử lý trôi dòng sau khi nhập số
    }

    public void inThongTin() {
        System.out.printf("| %-10s | %-20s | %-5d | %-7.2f |\n", maSV, hoTen, tuoi, diemTB);
    }
}
