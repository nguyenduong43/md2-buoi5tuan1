package lophoc;

public class lop {
    String name="john";
    String classes="C02";
    void setName(String name) {
        this.name = name;
    }
     String getName() {
        return this.name;
    }
    void setClass(String classes) {
        this.classes = classes;
    }
    String getClass(String classes) {
        return this.classes;
    }
    void hienthi()
    {
        System.out.println("hoc sinh name="+this.name+" hoc lop "+this.classes);
    }
    lop(){};
    lop(String name,String classes)
    {
        this.name=name;
        this.classes=classes;
    }
}
