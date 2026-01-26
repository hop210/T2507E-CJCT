package main.session2.ASM1;

import java.util.Scanner;

public class Main {
    //phan so
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Phân số 1
        PhanSo ps1 = new PhanSo();
        System.out.println("--- Nhập phân số thứ nhất ---");
        ps1.nhapPhanSo();

        // Phân số 2
        PhanSo ps2 = new PhanSo();
        System.out.println("--- Nhập phân số thứ hai ---");
        ps2.nhapPhanSo();

        // Hiển thị và tính toán
        System.out.print("Phân số 1: "); ps1.inPhanSo();
        System.out.print("Phân số 2: "); ps2.inPhanSo();

        PhanSo tong = ps1.add(ps2);
        System.out.print("Tổng (đã rút gọn): ");
        tong.inPhanSo();

        PhanSo hieu = ps1.sub(ps2);
        System.out.print("Hiệu (đã rút gọn): ");
        hieu.inPhanSo();
    }
}
