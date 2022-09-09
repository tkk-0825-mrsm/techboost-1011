//練習５－２ プログラム実行可能　自力でなんとか
public class Mail1{
    public static void main(String[]args){
      email(); 
    }
    
    public static void email(){
        String title ="日程調整のお願い";
        String address = "abcde@outlook.jp";
        String text ="本文";
        System.out.println(address+"に、以下のメールを送信しました");
        System.out.println("件名:"+title);
        System.out.println("本文:"+text);
    }
}