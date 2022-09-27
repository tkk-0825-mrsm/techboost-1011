//テックブースト　継承　祖父クラス
public class GrandFather {
    int getAge=50;
    String name="おじいちゃん";
    public void main (){
        System.out.println(this.name+"です");
    }
    public int getAge() {
        System.out.println(this.getAge+"です");
       return 50;
    }
  } 