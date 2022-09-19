//8章　RPG class  神の声
public class RPG{
    public static void main(String[]args){
        //勇者生成
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp=100;
    Matango m1 =new Matango();
    m1.hp = 50;
    m1.suffix = 'A';

    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';

    //冒険の始まり
   h.sit(5);
   h.slip();
   h.sit(25);
   h.run();
    }
}
