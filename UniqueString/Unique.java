import java.util.*;
class Unique
{
    public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        String n,s="";char c;int i,l,P,k=0;
        System.out.println ("Enter a word or a sentence");
        n = sc.nextLine()+" ";
        l = n.length();
        for (i=0;i<l;i++)
        {
            c = n.charAt(i);
            if (c==' ')
            {
                P = Check(s);
                if (P==1)
                {
                    k=1;s="";
                }
                else
                {
                    k=0;break;
                }
            }
            else
            s=s+c;
        }
        if (k==1)
        System.out.println ("It is a unique string");
        else
        System.out.println ("It is not a unique string");
    }
    static int Check(String s)
    {
        int l,i,j,k=0;
        l = s.length();
        for (i=0;i<(l-1);i++)
        {
            for (j=i+1;j<l;j++)
            {
                if ((s.charAt(i))== (s.charAt(j)))
                {
                    k=0;break;
                }
                else
                k=1;
            }
            if (k==0)
            break;
        }
        if (k==0)
        return 0;
        else
        return 1;
    }
}