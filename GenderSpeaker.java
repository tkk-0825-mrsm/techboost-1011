//テックブースト　文法3 課題2　穴埋めがまったくわからない　ポリモーフィズムってなに？
//GenderSpeaker class(処理実行クラス)
public class GenderSpeaker{
    public static void main(String[]args){
        doSpeak(new Man());
		doSpeak(new Woman());
	}

	private static void doSpeak(AbstractPerson person) {
		person.speak();
}
}
