//ï∂ñ@á@Å@â€ëËÇQ ï∂ÇÃç\ë¢(ì¡Ç…ÇSÅAÇTçsñ⁄à»ç~Ç™Ç«Ç§Ç¢Ç§éwé¶Ç»ÇÃÇ©ÇÊÇ≠ÇÌÇ©ÇÁÇ»Ç¢)
public class FizzBuzz2{
    public static void main(String[]args) {
        if(args.length == 0){
            return;
        }
        int max =Integer.parseInt(args[0]);
        String result=null;
        for(int i=0; i<max;i++) {
            int num =i+1;
            result="";
            if(num %3 ==0) {
                result=result+"Fizz";
            }
            if(num %5==0){
                result=result+"Buzz";
            }
            if(result.length()==0){
                result=result+num;
            }
            System.out.println(result+"");
        }
        
    }

}

    