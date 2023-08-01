import java.lang.*;
class Main
{
    public static void main(String args[])
{
    int A[]={1,1,1,1};
    int count =0;
    for(int i=0;i<A.length;i++)
    {
        for(int j=i+1;j<A.length;j++)
        {
            if(A[i]==A[j])
            {
                count++;
            }
        }
    }
    System.out.println(count);
}
}