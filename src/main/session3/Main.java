package main.session3;

import main.session3.ASM2.SinhVien;

import java.util.Scanner;

public class Main {
    // phan so
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Phân số 1
//        PhanSo ps1 = new PhanSo();
//        System.out.println("--- Nhập phân số thứ nhất ---");
//        ps1.nhapPhanSo();
//
//        // Phân số 2
//        PhanSo ps2 = new PhanSo();
//        System.out.println("--- Nhập phân số thứ hai ---");
//        ps2.nhapPhanSo();
//
//        // Hiển thị và tính toán
//        System.out.print("Phân số 1: "); ps1.inPhanSo();
//        System.out.print("Phân số 2: "); ps2.inPhanSo();
//
//        PhanSo tong = ps1.add(ps2);
//        System.out.print("Tổng (đã rút gọn): ");
//        tong.inPhanSo();
//
//        PhanSo hieu = ps1.sub(ps2);
//        System.out.print("Hiệu (đã rút gọn): ");
//        hieu.inPhanSo();
//    }

    //sinh vien

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên (h): ");
        int h = sc.nextInt();
        sc.nextLine(); // Xử lý trôi dòng

        //  Khai báo mảng để chứa h sinh viên
        SinhVien[] danhSach = new SinhVien[h];

        //  Vòng lặp nhập thông tin
        for (int i = 0; i < h; i++) {
            System.out.println("\nNhập thông tin sinh viên thứ " + (i + 1) + ":");
            danhSach[i] = new SinhVien(); // Quan trọng: Phải khởi tạo từng phần tử mảng
            danhSach[i].nhapThongTin(sc);
        }

        // Vòng lặp xuất thông tin
        System.out.println("\n" + "=".repeat(50));
        System.out.println("DANH SÁCH SINH VIÊN ĐÃ NHẬP");
        System.out.printf("| %-10s | %-20s | %-5s | %-7s |\n", "Mã SV", "Họ Tên", "Tuổi", "Điểm TB");
        System.out.println("-".repeat(50));

        for (int i = 0; i < h; i++) {
            danhSach[i].inThongTin();
        }
        System.out.println("=".repeat(50));

        sc.close();
    }

}
