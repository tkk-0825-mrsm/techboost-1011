//練習4-2
public class Kouza{
    public static void main (String[]args){
        int [] moneyList = {121902,8302,55100};
        //for文　まだ自力で書けなかった
        for(int i = 0; i<moneyList.length; i++);
        System.out.println(moneyList[i]);
    }
    //拡張for文 解答見ながら
    for (int m :moneyList){
        System.out.println(m);
    }
}