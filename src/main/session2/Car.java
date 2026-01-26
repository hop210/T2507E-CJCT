package main.session2;

public class Car {
    //attribute

    String brand; // class variable
    Integer year;

    //constructor - hàm khởi tạo - tự động chạy khi tạo đối tượng
    public Car(){// hàm khởi tạo không tham số
        System.out.println("ABC XYZ ...");
    }

    public Car(String x, Integer y){ // hàm khởi tạo có tham số
        System.out.println("123456...");
    }

    //method - behavior
    public void run(){
        System.out.println(this.brand+" is running...");
    }

    public void maintain(){
        System.out.println(this.brand+" is maintaining");
    }
    // kiểm tra xem năm sản xuất đã quá hạn chưa, giả định là 10 năm hết hạn
    public boolean checkDate(){
        int now = 2026;
        int yearP = this.year;// đối tượng ngầm định của chính nó trong
        if (now -yearP >10){
            return false;
        }else {
            return true;
        }
    }

}
