import java.io.*;
class MindGame
{
    public static void main ()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n,a;int i=1,c=0,k=0;
        System.out.println ("Enter the first word");
        n = br.readLine();
        System.out.println ("\f");
        System.out.println ("Enter the word which you have given previosly");
        a = br.readLine();
        if (n.equals(a))
        {
            c++;
            while (i>0)
            {
               System.out.println ("Enter another word");
               n = n+" "+br.readLine();
               System.out.println ("\f");
               System.out.println ("Enter all the words you have given");
               a = br.readLine();
               if (n.equals(a))
               {
                   c++;i++;
               }
               else
               {
                   k=1;break;
               }
            }
        }
        if (k==1)
        {
            System.out.println ("Game Over");
            System.out.println ("Your score "+c);
        }
    }
}