//練習6－１　2回目 Zenhan1 class Kouhan1 class どちらもimportするには？
//import japp.Zenhan1.*;
//import japp.Kouhan1.*; 
//2,3行目のかたちではimportでZenhan1とKouhan1のclassのこの呼び出しはできない？

public class KoumonSama{
    public static void main(String[]args) throws Exception{
    //Zenhan1 class
    japp.Zenhan1.doWarusa();
    japp.Zenhan1.doTogame();
    //Kouhan1 class
    japp.Kouhan1.callDeae();
    japp.Kouhan1.showMondokoro();
    }
}