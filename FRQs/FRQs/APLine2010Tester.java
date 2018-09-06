public class APLine2010Tester
{
    public static void main(String[] args)
    {
        APLine2010 line1 = new APLine2010(5, 4, -17);
        double slope1 = line1.getSlope();
        boolean onLine1 = line1.isOnLine(5, -2);
        System.out.println(slope1 + " " + onLine1);
        
        APLine2010 line2 = new APLine2010(-25, 40, 30);
        double slope2 = line2.getSlope();
        boolean onLine2 = line2.isOnLine(5, -2);
        System.out.println(slope2 + " " + onLine2);
    }
}