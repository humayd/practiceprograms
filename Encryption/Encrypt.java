import java.io.*;
class Encrypt
{
    public static void main ()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n,s="",s1="",P,S;char c;int i,l,k;
        System.out.println ("Enter the word or sentence you want to encrypt");
        n = br.readLine()+" ";
        l = n.length();
        System.out.println ("Enter the key for encryption");
        k = Integer.parseInt(br.readLine());
        for (i=0;i<l;i++)
        {
            c = n.charAt(i);
            if (c==' ')
            {
                if (k<0)
                {
                    S = EncryptSub(s,k);
                    s1=s1+S+" ";
                }
                else
                {
                    P = EncryptAdd(s,k);
                    s1=s1+P+" ";
                }
                s="";
            }
            else
            s=s+c;
        }
        System.out.println (s1);
    }
    static String EncryptAdd(String s,int k)
    {
        int l,i,j,x=0;char c;String s1="";
        l = s.length();
        for (i=0;i<l;i++)
        {
           c=s.charAt(i);
           x=(int)c;
           for (j=1;j<=k;j++)
           {
               if ((x+1)>90&&(x+1)<97)
               {
                   x=65;
                   continue;
               }
               else if((x+1)>122)
               {
                   x=97;
                   continue;
               }
               else
               x=x+1;
           }
           s1=s1+(char)x;
        }
        return s1;
    }
    static String EncryptSub(String s,int k)
    {
        int l,i,j,x=0;char c;String s1="";
        l = s.length();
        for (i=0;i<l;i++)
        {
           c=s.charAt(i);
           x=(int)c;
           for (j=-1;j>=k;j--)
           {
               if ((x-1)<97&&(x-1)>90)
               {
                   x=122;
                   continue;
               }
               else if((x-1)<65)
               {
                   x=90;
                   continue;
               }
               else
               x=x-1;
           }
           s1=s1+(char)x;
        }
        return s1;
    }
}