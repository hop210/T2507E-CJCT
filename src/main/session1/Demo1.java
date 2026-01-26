package main.session1;
import java.util.Scanner;

public class Demo1 {
    public static void main(String args[]){
        //System.out.println("Hello World!");
            // thuần cơ bản
            int x = 10;
            float y = 3.14f;
            double z = 3.14159;
            boolean t = true;
            char c = 'h';
            String s = "Hello World!";

            // Double,Int,Float,.. chữ đầu viết hoa là oop- hướng đối tượng
        System.out.println(s+x); // string  + number  -> string (giống JS)
        int u = 20;
        int v = 30;
        System.out.println(u+"+"+v+"="+add(u,v));
        System.out.println(u+"/"+v+"="+div(u,v));

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập vào số a: ");
//        int a = sc.nextInt();
//        System.out.println(check1(a));

        // nhập vào 1 số từ bàn phím
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        n=sc.nextInt();
        // kiểm tra có phải số nguyên tố hay không
        // thông báo kết quả
        if(isPrime(n)){
            System.out.println(n+" is prime!");
        }else{
            System.out.println(n+" is not a prime");
        }

        double p;
        p= sc.nextDouble();
    }

    public static int add(int a, int b){
        return a+b;
    }
    public static double div(int a,int b){
        if(b==0) return 0;
        return (double) a /b;
    }
    //Viết hàm kiểm tra 1 số nguyên có phải số nguyên tố hay không
    public static String check1(int a){
        if (a<2){
            return " không phải số nguyên tố";
        }
        for (int i = 2; i * i <= a; i++) {
            if( a % i ==0){
                return " không phải số nguyên tố";
            }
        }
        return "là số nguyên tố";
    }

    public  static boolean isPrime(int b){
        if (b<2) return false;
        if (b<4) return true;
        for (int i = 2; i <= b/2 ; i++) {
            if (b%i==0) return false;
        }
        return true;
    }
}
