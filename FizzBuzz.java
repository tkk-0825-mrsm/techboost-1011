//文法１　課題�@ 引数の上限を決めない場合はどうすればいいか(for以降)
public class FizzBuzz{
    public static void main(String[]args){
        for(int i=1; i<=34; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{System.out.println(i);
                
            }

            }
        }
    }

    