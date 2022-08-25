//練習4-4
public class numberQuiz{
    public staic void main (String[]args){
        int numbers ={3,4,9};
        System.out.println("1桁の数字を入力してください");
        //ここから後ろは解答確認した
        int input = new java.util.Scanner(System.in).nextInt();
        //配列を回しながら判定
        for(int n:numbers){
            if(n == input){
                System.out.println("アタリ！");
            }
        }
    }    
}