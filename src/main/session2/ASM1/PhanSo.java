package main.session2.ASM1;

import java.util.Scanner;

public class PhanSo {

        private int tuSo;
        private int mauSo;

        // Constructor không đối số
        public PhanSo() {
            this.tuSo = 0;
            this.mauSo = 1;
        }

        // Constructor có đối số
        public PhanSo(int tuSo, int mauSo) {
            this.tuSo = tuSo;
            this.mauSo = (mauSo == 0) ? 1 : mauSo; // Tránh mẫu số bằng 0
        }

        // Getter và Setter
        public int getTuSo() { return tuSo; }
        public void setTuSo(int tuSo) { this.tuSo = tuSo; }

        public int getMauSo() { return mauSo; }
        public void setMauSo(int mauSo) {
            if (mauSo != 0) this.mauSo = mauSo;
        }

        // Nhập phân số
        public void nhapPhanSo() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập tử số: ");
            this.tuSo = sc.nextInt();
            do {
                System.out.print("Nhập mẫu số (khác 0): ");
                this.mauSo = sc.nextInt();
            } while (this.mauSo == 0);
        }

        // In phân số
        public void inPhanSo() {
            if (tuSo == 0) System.out.println(0);
            else if (mauSo == 1) System.out.println(tuSo);
            else System.out.println(tuSo + "/" + mauSo);
        }

        // Tìm UCLN (dùng giải thuật Euclid)
        private int timUCLN(int a, int b) {
            a = Math.abs(a);
            b = Math.abs(b);
            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }
            return a;
        }

        // Rút gọn phân số
        public void rutGon() {
            int ucln = timUCLN(this.tuSo, this.mauSo);
            this.tuSo /= ucln;
            this.mauSo /= ucln;
        }

        // Nghịch đảo phân số
        public void nghichDao() {
            if (tuSo != 0) {
                int temp = tuSo;
                tuSo = mauSo;
                mauSo = temp;
            } else {
                System.out.println("Không thể nghịch đảo vì tử số bằng 0!");
            }
        }

        // Các phép toán: Cộng, Trừ, Nhân, Chia
        public PhanSo add(PhanSo ps2) {
            int tu = this.tuSo * ps2.mauSo + ps2.tuSo * this.mauSo;
            int mau = this.mauSo * ps2.mauSo;
            PhanSo ketQua = new PhanSo(tu, mau);
            ketQua.rutGon();
            return ketQua;
        }

        public PhanSo sub(PhanSo ps2) {
            int tu = this.tuSo * ps2.mauSo - ps2.tuSo * this.mauSo;
            int mau = this.mauSo * ps2.mauSo;
            PhanSo ketQua = new PhanSo(tu, mau);
            ketQua.rutGon();
            return ketQua;
        }

        public PhanSo mul(PhanSo ps2) {
            int tu = this.tuSo * ps2.tuSo;
            int mau = this.mauSo * ps2.mauSo;
            PhanSo ketQua = new PhanSo(tu, mau);
            ketQua.rutGon();
            return ketQua;
        }

        public PhanSo div(PhanSo ps2) {
            int tu = this.tuSo * ps2.mauSo;
            int mau = this.mauSo * ps2.tuSo;
            PhanSo ketQua = new PhanSo(tu, mau);
            ketQua.rutGon();
            return ketQua;
        }

}
