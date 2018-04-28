import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        Reverse r=new Reverse();
        r.getInput();
        r.arrayReverse();

    }
}

class Reverse
{
    Scanner s=new Scanner (System.in);
    public int t,ar[];
    public void getInput()
    {
        t=s.nextInt();
        ar=new int[t];
        while(t>0)
        {
            for(int i=0;i<t;i++)
            {
                ar[i]=s.nextInt();
            }
            t--;
        }
    }
    public void arrayReverse()
    {
        for(int i=t-1;i>=0;i++)
            System.out.print(ar[i]+"_");
    }

}