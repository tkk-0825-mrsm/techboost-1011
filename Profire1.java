//練習5-1 自力で完了　utfでは文字化け
public class Profire1{
    public static void main(String[]args){
        System.out.println("自己紹介をします");
    introduceOneself();        
    }

    public static void introduceOneself(){
        String name = "Takako";
        int age =25;
        double height = 159.5;
        char eto ='丑';
        System.out.println("私の名前は"+name+"です");
        System.out.println("年齢は"+age+"です");
        System.out.println("身長は"+height+"です");
        System.out.println(eto+"年です");
    }
}