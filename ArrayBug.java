//javaî{@Kâè2
class ArrayBug{
    public static void main(String [] args) {
        String[] name =new String[5];

        name[0] ="÷ä";
        name[1] ="c´";
        name[2] ="ì";
        name[3] ="éØ";
        name[4] ="¬Ñ";

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);  
    }
}