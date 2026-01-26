package main.session2;

public class Tamgiac {
    Integer canh1;
    Integer canh2;
    Integer canh3;

    public Tamgiac(Integer canh1,Integer canh2,Integer canh3){
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }
    public Integer chuVi(){
        Integer chuViInteger=canh1+canh2+canh3;
        return chuViInteger;
    }

    public Double dienTich(){
        Integer nuaChuVi = (canh1+canh2+canh3)/2;
        Double dienTichDouble = Math.sqrt(nuaChuVi*(nuaChuVi-canh1)*nuaChuVi*(nuaChuVi-canh2)*nuaChuVi*(nuaChuVi-canh3));
        return dienTichDouble;
    }
}
