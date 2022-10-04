//テックブースト　文法3 課題2
//Man class 継承class宣言まではできた 穴埋めは勘　returnとオーバーライドの使い方わからない　
public class Man extends AbstractPerson{
//アノテーション(警告しない？)
    @Override //親クラスからオーバーライドしたことの目印
    public String getGender() { //親クラスのメソット　子クラスの中で作らないといけない
		//なんで小文字？　終わったときに返す値　ただの文章""なので　
    //呼んだところへ返す 親クラスのspeakメソットへ帰す
      return "man"; 
    
	}
}