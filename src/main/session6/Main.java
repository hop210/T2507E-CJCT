package main.session6;

public class Main {
    public static void main(String[] args) {
        // cú pháp sử lý ngoại lệ
        try {
            System.out.println("Start...");
            int x = 10;
            int y = 0;
            if (y<5){
                throw new ArithmeticException("Số bé quá không được");
                // chủ động tạo báo lỗi( chủ động phát ra ngoại lệ)
            } else if (y<8) {
                throw new ArithmeticException();
            }
            int z;
            z = x/y;
            System.out.println("z="+z);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi tính sai");
        } catch (Exception e) {
            System.out.println("Lỗi rồi!!!");
        } finally {
            // lúc nào cũng chạy qua
        }
        try {
            readExcelFile();
        } catch (Exception e) {

        }

    }
    public static void readExcelFile() throws Exception{
            // giả sử hàm này có thể có exception
        }

}
