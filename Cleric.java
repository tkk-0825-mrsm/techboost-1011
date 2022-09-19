//練習8-1 Cleric class 
//練習8－2はいまいちできなかった 
//練習8－3 static使わない理由は？　解答見ないとできなかった
//練習8－4　解答見ないとできなかった

import java. util.*;

public class Cleric{
    public void main(String[]args){
        String name;
        int hp =50;
        final int Max_HP =50;
        int mp =10;
        final int Max_MP =10;
    }
    public void selfAid(){
        System.out.println(this.name+"は、セルフエイドを唱えた!");
        this.hp=this.Max_HP;
        this.mp-=5;
        System.out.println("HPが最大まで回復した!");
    }
    public int pray(int sec){
        System.out.println(this.name+"は"+sec+"秒間、天に祈った!");
        //ランダムでポイント
        int recover= new java.util.Random().nextInt(3)+sec;
        
        //ポイント補正(実際の回復力)
        int recoverActual =Math.min(this.Max_MP - this.MP,recover);

        this.mp += recoverActual;
        System.out.println("MPが"+recoverActual+"回復した!");
        return recoverActual;
    }
}
