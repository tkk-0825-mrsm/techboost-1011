//テックブースト　文法3 課題2　穴埋めがまったくわからない　ポリモーフィズムってなに？
//GenderSpeaker class(処理実行クラス)
public class GenderSpeaker{
    public static void main(String[]args){

		//dospeakメソットを呼び出す　メソット名();でメソット名を呼び出す    
        doSpeak(new Man()); //インスタンスを作ってそれを引数として渡す　Man型のインスタンス
		doSpeak(new Woman());
	}

	//引数を引き取っている()の中の型にあった引数を渡す　publicはどこからでも呼び出せる　誰が見れるか使えるか
	//親クラスの型を受け取っている　manとwomanは継承元(親classが一緒)が同じなのでこれ1つでまかなえる
	public static void doSpeak(AbstractPerson person) {
		
		//インスタンス.メソット名();でメソットを呼び出す
		person.speak(); //Man classの
}
}
