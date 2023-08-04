import java.lang.*;
class Main
{
    public static void main(String args[])
    {
        int A[]={1,2,3,4,5,6,7};
        for(int i=0,j=A.length-1;i<A.length/2&&j>=A.length/2;i++,j--)
        {
            int temp = A[i];
                A[i] = A[j];
                A[j] = temp;

        }
        for(int x:A)

        {
            System.out.println(x);
        }
    }
}