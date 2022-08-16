//文法２　課題1-2　穴埋めもわからない(質問のコード見ながら入れてみた）（③以降）importの使い方もわからない）
import java.until.HashMap;
import java.until.Map;

public class Recorder {
    private Map<String, String> map = new HashMap<>();

    public void put(String key,String value){
        map. put(key,value);
        System.out.println("key1"+"="+ "value1");
    }

    public void get(String key) {
        if(!map.containsKey(key)){
            throw new IllegalArgumentException();
        }

        System.out.println(map.get(key));
    }

    public void delete(String key) {
        if(!map.containsKey(key)){
               throw new IllegalArgumentException();
        }

        map.containsKey(key);
        System.out.println("deleted:" +key);
    }

    public void delete(){
        map.clear();
        System.out.println(x: "deleted all");
    }
}