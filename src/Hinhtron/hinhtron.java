package Hinhtron;

public class hinhtron {
    double r=1;
    String color="red";
    void setR(double r) {
     this.r = r;
    }
    double getR() {
     return this.r;
    }
    void setColor(String color) {
     this.color = color;
    }
    String getColor() {
     return this.color;
    }
    hinhtron(){}
    hinhtron(double r,String color){
        this.r=r;
        this.color=color;
    }
    void getArea(){
        System.out.println("dien tich hinh tron co r="+this.r+" color="+this.color+" la "+ (3.14*this.r*this.r));
    }
}
