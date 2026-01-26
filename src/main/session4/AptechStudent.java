package main.session4;

public class AptechStudent extends FPTStudent{

    public void playGame(){ // override method
        System.out.println("APTECH Student play game....");
    }

    //overload - nạp chồng
    public void run(){
        super.playGame();// nếu bị ghi đè mà muốn chạy cái của lớp cha thì dùng super
        System.out.println("running 5km/h");
    }
    public void run(int x){
        System.out.println("running 10km/h");
    }
    public void run(String msg){
        System.out.println("20km/h");
    }

    public void sing(String s,int a){}
    public void sing(int a,String s){}
}
