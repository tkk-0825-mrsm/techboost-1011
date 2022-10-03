//テックブースト　文法2 課題2
public class TryCatchFinallySample {

	//引数をcatchしている　
	//どんなデータかわからないものを引数として引き取っている(確定してない情報を引き取る)
	public static void main(String[] args) { //文字を入れるための配列
		
		//tryの中に処理を書く
		try{
			System.out.println("try");
			
			//Integer.parseInt:もともとjavaに入ってるメソット　String型からint型に変換するもの
			Integer.parseInt(args[0]);	//[]引きだし状の箱　配列を意味する　0なのでいちばん最初の配列
		
			//catch:tryの中で問題が起きた時の処置(エラーにならないように、強制終了しないための処置) 
		//エラーメッセージとかでユーザーを誘導する処理　エラーで落ちないように
		} catch (Exception e) {
			System.out.println("catch"); //エラーについてのメッセージを残す　ログを残す≒保険をかけている　思わぬ事態に対応
		
		//tryの処理が終わったら絶対にやりたい処理　省略してもOK(特にやりたいことがなければ)
		} finally {
			System.out.println("finally"); //ex)開いたファイルを閉じる処理、データベースの接続の遮断、解除
		}
	}
}
