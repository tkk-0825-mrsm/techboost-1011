//テックブースト　文法3 課題3 列挙型以外は理解できてない
//TextReader class

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.*;

public class TextReader {
	private String path;

	private static Logger logger = Logger.getLogger(TextReader.class.getName());
    
    //列挙型ってことはenum?
	public enum Mark {START, END
	};

	private TextReader(String path) {
		this.path = path;
	}

	private void execute() {
        //TODO: この `valueList` 変数はIntegerのインスタンスしか追加しないので、総称型を利用したObjectListを使うように書き換え
        //回答よくわからない　Integerどこからきた？
		List<Integer> valueList = new ObjectList<>();
        
        // TODO: リソース付き try 文を使う
        //()内にはcloseによる後片付けが必要な変数の宣言　本来の処理
		try (FileReader fr = new FileReader(path);BufferedReader br =
         new BufferedReader(fr)) {
			String line = null;
			while ((line = br.readLine()) != null) {
				valueList.add(Integer.parseInt(line));
			}
    
        //例外処理
		} catch (IOException e) {
			e.printStackTrace();
		}
        // TODO: 拡張 for 文を利用
		for (Integer value : valueList) {
			System.out.println(value);
		}
	}
   
    // TODO: ここで可変長引数:ピリオドを3つ並べる
	public static void main(String...args) {
		logger.info(Mark.START.name());
		new TextReader(args[0]).execute();
		logger.info(Mark.END.name());
	}

}
