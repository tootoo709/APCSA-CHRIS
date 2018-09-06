/**
 * Auto Generated Java Class.
 */
public class APLine2010 {
    private int a , b, c; 
    
    
    public APline2010(int a2,int b2,int c2)
    {
        a = a2;
        b = b2;
        c = c2;
       
    }
    public double getSlope()
    {
        return (-1 * (a/b)); 
    } 
    public boolean isOnLine(x,y) 
    {
        if (((a * x) + (b * y) + (c)) == 0)
        {
            return true;
        } 
        return false; 

    }
}
