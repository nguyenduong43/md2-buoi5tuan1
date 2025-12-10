package hocsinh;

public class Student {
    int ma;
    String ten;
    private static String trangthai="nghi hoc";
    Student(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
   static void Trangthai(){
        trangthai="dang hoc";
    }
    void hienthi()
    {
        System.out.println(this.ma+" "+this.ten+" "+this.trangthai);
    }
}
