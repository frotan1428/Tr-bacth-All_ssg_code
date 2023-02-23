package Stattic;

public class Static03 {

    //output u ne dir?
    static int x=1;
    int y=1;
    Static03(){
        x=+9;
        y++;
    }

    public static void main(String[] args) {
        Static03 sm1=new Static03();
        Static03 sm2=new Static03();

        System.out.println("-X"+ sm1.x+ "-Y"+sm2.y);


    }
}
