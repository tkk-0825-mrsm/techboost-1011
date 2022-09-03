//���@�@�@�ۑ�Q ���̍\��(���ɂS�A�T�s�ڈȍ~���ǂ������w���Ȃ̂��悭�킩��Ȃ�)
public class FizzBuzz2{
    //argsは引き出し
    public static void main(String[]args) {
        //ユーザーが引数を渡さない。引数がない場合はなにもせずにこのclassを終わらせる　引数がきてるか　前提が満たされているか
        if(args.length == 0){
            return;
        }
        //String型からint型に変更する処理
        int max =Integer.parseInt(args[0]);  //int型に変換する処理　文字を数字に変換する処理　[]の中の数字は引き出しの数
        //nullはからっぽ　
        String result=null; //数えたりできない　ex)コップそのものがない
        for(int i=0; i<max; i++) {             //セミコロン区切りで3つの情報を入れる、iがmaxより小さい間、処理を繰り返す　
            int num =i+1;                      //引数は0より大きいため
            result=""; //空白を入れている 毎回空っぽにするために空白にしている
            if(num %3 ==0) {
                result=result+"Fizz";
            }
            if(num %5==0){
                result=result+"Buzz";
            }
            if(result.length()==0){  //resultという変数の中に文字が何文字入っているか　resultの中身が空っぽになっているか確認している
                result=result+num; //resultの中に代入
            }
            System.out.println(result+""); //resultの中身に
        }
        
    }

}

    