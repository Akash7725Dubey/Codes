interface Test
        {
         void Meth1();
         void Meth2();
        }
 class My implements Test
 {
     public void Meth1()
     {
         System.out.println("Meth1 of My class");
     }
     public void Meth2()
     {
         System.out.println("Meth2 of My class");
     }
     public void Meth3()
     {
         System.out.println("Meth3 of My class");
     }
 }
 public class Main
 {
     public static void main(String args[])
     {
         Test t=new My();
         t.Meth1();
         t.Meth2();
     }
 }