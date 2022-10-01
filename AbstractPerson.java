//テックブースト　文法3　課題2　 
//AbstractPerson class 穴埋めよくわからない　newできない場合のインスタンス化は？
//抽象メソットを含むクラス宣言
public abstract class AbstractPerson{
    public abstract String getGender();
    public void speak(){
        System.out.println("I'm a " + getGender()); //なぜgetGender()なのか
    }
}