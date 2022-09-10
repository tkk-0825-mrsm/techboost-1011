//練習6-1 2回目 Kouhan1 class　ﾒｿｯﾄ名の後ろの()はなぜ空欄なのか？
package japp;

public class Kouhan1{
    public static void callDeae(){
        System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
    }
    public static void showMondokoro() throws Exception{
        System.out.println("飛車さん、角さん。もういいでしょう。");
        System.out.println("この紋所が目に入らぬか！");
        //練習6－3
        java.lang.Thread.sleep(3000);
        Zenhan1.doTogame();
    }    
}
