//テックブースト　文法3　課題2　 
//AbstractPerson class 穴埋めよくわからない　newできない場合のインスタンス化は？
//抽象メソットを含むクラス宣言
public abstract class AbstractPerson{
    
    //抽象ﾒｿｯﾄ　子クラスのほうでどんな処理するか実装してほしいという意味
    public abstract String getGender(); //子クラスでこのメソットを必ず作らないといけない
    public void speak(){
        System.out.println("I'm a " + getGender()); //なぜgetGender()なのか　//子クラスのgetGenderが呼び出される
    }
}