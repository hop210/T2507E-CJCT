package main.session4;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.study();
        FPTStudent f = new FPTStudent();
        f.study();
        f.playGame();
        // tính kế thừa thằng cha có cái gì thằng con có hết, có cả private nhưng không có quyền truy cập
        AptechStudent a = new AptechStudent();
        a.study();
        a.playGame();
        // 1 lớp chỉ có 1 cha, nhưng cha có nhiều đứa con
        // bản chất cuả kế thừa là thằng con copy hết những gì thằng cha có
        // nó sẽ chạy hàm có lớp gần nhất nếu có ghi đè(override)
    }
}
