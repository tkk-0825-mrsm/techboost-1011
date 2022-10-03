//テックブースト　文法2課題1 メンターさんと回答参照
import java.util.HashMap; //もともとjavaに入ってるもの
import java.util.Map;     //もともとjavaに入ってるもの

public class Recorder {
 private Map<String, String> map = new HashMap<>(); //このclassでしか使わない <>内はkeyの型とvalueの型　
//マップに登録するためのメソット
	public void put(String key, String value) { //引数引き取る
		map.put(key, value); //mapに登録？　③はput
		System.out.println(key+"="+value); //最初に定義しているからStringはいらない
	}
	//マップにkeyが存在する時にvalueを出力する(登録済の時)
	public void get(String key) {
		if (!map.containsKey(key)) {   //やりたいことの前にチェックを入れる keyがあるかどうか 頭に!がついてたらfauleだったらいう意味 ⑥はcontainskey
			throw new IllegalArgumentException(); //⑦はthrow エラー内容を表示する　map.containskeyがfaulseだったら if文に入らなかった場合
		}
	
		System.out.println(map.get(key));
	}
	
	//引数があるとき
    public void delete(String key) {
		if (!map.containsKey(key)) {
			throw new IllegalArgumentException(); //⑦はthrow keyがマップに存在しなかったら
		}

		map.remove(key); //⑧はremove　　1個だけkeyを渡す
		System.out.println("deleted: "  + key); 
	}
	
	//引数がないとき
    public void delete() {
		map.clear();     //⑨はclear マップに入っているものはすべて削除
		System.out.println("deleted all"); 
	}
}
