//—ûK‚T|‚S –ß‚è’l‚Ìİ’è‚ª‚æ‚­‚í‚©‚ç‚È‚¢
//—ûK‚T|‚R@ƒI[ƒo[ƒ[ƒh‚Í‚æ‚­‚í‚©‚ç‚È‚¢

public class Area1{
    public static void main(String[]args){
    double TriangleArea = calcTriangleArea(10.0,5.0);
    System.out.println("OŠpŒ`‚Ì–ÊÏ‚Í"+TriangleArea+"•½•ûcm");
    double CircleArea = calcCircleArea(5.0);
    System.out.println("‰~‚Ì–ÊÏ‚Í"+CircleArea+"•½•ûcm"); 
    }
    public static double calcTriangleArea (double bottom,double height){
        double area = (bottom*height)/2;
        return area;

    }
    public static double calcCircleArea(double radius){
        double area = radius*radius*3.14;
        return area;

    }


}