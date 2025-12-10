package Hinhtron;

public class testHinhTron {
    public static void main(String[] args) {
        hinhtron ht1=new hinhtron();
        ht1.getArea();
        hinhtron ht2=new hinhtron(5,"green");
        ht2.getArea();
        hinhtron ht3=new hinhtron(4,"blue");
        ht3.setR(6);
        ht3.getArea();
    }
}
