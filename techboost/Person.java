//テックブースト　文法3 課題１ 穴埋めしただけで理解できてない
public class Person{
    public enum Gender { MAN, WOMAN };	
    private Gender gender;
      
    //コンストラクタ　最初にMANを渡す
        public Person(Gender gender) {
            //このクラスのジェンダー　渡してもらってクラス変数へ入れる　manかwomanどっちか入れる
            this.gender = gender;
        }
    //Personクラスのspeakメソットを呼び出す
        public void speak() {
            switch (gender) {
                case MAN:
                    System.out.println("I'm a man");
    break;
                case WOMAN:
                    System.out.println("I'm a woman");
    break;
    default:
    }
        }
    public static void main(String[] args) {
            Person man = new Person(Gender.MAN);
            man.speak();
    
            Person woman = new Person(Gender.WOMAN);
            woman.speak();
        }
    }