//練習9-1
public class Thief{
    String name;
    int hp;
    int mp;
 public Thief(String name,int hp,int mp){ //名前、HP、MPを指定してインスタンス化(よくわからない)
    this.name=name;
    this.hp=hp;
    this.mp=mp;
 }

 public Thief(String name,int hp){  //名前、HPだけ指定 MPは5で初期化される(自力でできず)
    this(name,hp,5);  //最初のコンストラクトから呼び出し？
}
 public Thief(String name){  //名前だけ指定してインスタンス化(thisの後ろは引数なのでStringはいらない)
    this(name,40,5);
 }
}