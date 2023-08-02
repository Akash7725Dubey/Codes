import java.lang.*;

class Main
{
    public static void main(String args[])
    {
        int count=0;
        int sum=0;
        int p=7;
        for(int i=101;i<200;i++)
        {
            if(i%p==0)
            {
                count++;
                sum+=i;
            }
        }
        System.out.println(count);
        System.out.println(sum);
    }
}