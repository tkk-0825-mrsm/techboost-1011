//テックブースト文法3　課題3　(質問の答え写した)
//ObjectList.java class
import java.util.ArrayList;

//ArrayListのコード　<>の中はなんでＴなの？
public class ObjectList<T> extends ArrayList<T> {

    public boolean add(T value) {
		return super.add(value);
	}

	public T get(int index) {
		return super.get(index);
	}
}
