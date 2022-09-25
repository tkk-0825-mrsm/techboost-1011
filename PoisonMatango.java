//練習10-3 extends以降かけなかった
public class PoisonMatango extends Matango1{
    int PoisonCount = 5; //毒を用いた攻撃の初期値5回　ウの内容
    public PoinsonMatango(char suffix){
        super(suffix);
    }
    public void attack(Hero h){  //エの内容
        super.attack(h); //エの1
        if(this.Poisoncount>0){  //エの2
            System.out.println("さらに毒の胞子をばらまいた!"); //エの3
            int dmg = h.hp/5; //エの4
            h.hp -=dmg;
            System.out.println(dmg+"ポイントのダメージ!");
            this.PoisonCount--; //エの5
        }
    }

}