//練習5－2
public class Email{
    public static void main (String[]args){
        //ここから跡がわからない、mainﾒｿｯﾄで入れないとダメ？
        String title = "title";
        String address = "guest";
        String text = "message";
        email(title,address,text);
    }
    //Stringの後ろはなんで？　argsじゃないの？　email()で変数を宣言(4~6行目）するのならどうか？
    public static void email(String title,String address,String text){
        System.out.println(address+"に、以下のメールを送信しました");
        System.out.println("件名:"+title);
         System.out.println("本文:"+text);
    }
}