import java.util.*;
class q38
{
    public static void main(String args[]) 
    {
        int i,j,k,p;
        for (i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++) 
            {
                System.out.print(" ");
            }
            for(k=i;k<=5;k++)
            {
                System.out.print("*");
            }
            for(p=1;p<=5-i;p++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
