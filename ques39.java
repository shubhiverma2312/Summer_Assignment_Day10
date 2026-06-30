import java.util.*;
class q39
{
    public static void main(String args[])
    {
        int i,j,k,p,c,x;
        for(i=1;i<=5;i++)
        {
            x=i-1;
            for(j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            c=1;
            for(k=1;k<=i;k++)
            {
                System.out.print(c);
                c++;
            }
            for(p=1;p<=i;p++)
            {
                if(x==0) System.out.print(" ");
                else
                {
                    System.out.print(x);
                    x--;
                }
            }
            System.out.println();
        }
    }
}