import java.util.*;
class q40
{
    public static void main(String args[])
    {
        int i,j,k,p,c,x;
        for(i=1;i<=5;i++)
        {
            x=63+i;
            for(j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            c=65;
            for(k=1;k<=i;k++)
            {
                System.out.print((char)c);
                c++;
            }
            for(p=1;p<=i;p++)
            {
                if(x==64) System.out.print(" ");
                else
                {
                    System.out.print((char)x);
                    x--;
                }
            }
            System.out.println();
        }
    }
}