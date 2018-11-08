import java.util.*;
class InsertCopy
{
    public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        int n,i,t,a,j,k=0,p=0;
        System.out.println ("Enter the size of the array");
        n = sc.nextInt();
        int ar[]=new int[n+1];
        for (i=0;i<n;i++)
        {
            System.out.println ("Enter a number for position no. " + (i+1));
            ar[i] = sc.nextInt();
            if (ar[i]>p)
            p = ar[i];
        }
        for (i=0;i<(n-1);i++)
        {
            for (j=i+1;j<n;j++)
            {
                if (ar[i]>ar[j])
                {
                    t = ar[i];
                    ar[i] = ar[j];
                    ar[j] = t;
                }
            }
        }
        System.out.println ("Enter the number you want to insert");
        a = sc.nextInt();
        for (i=n;i>0;i--)
        {
                if (a>p)
                {
                    ar[n]=a;break;
                }
                else if (a>ar[i-1])
                {
                    t = ar[i];
                    ar[i]=a;
                    ar[i+1]=t;
                    break;
                }
                else if (a<ar[0])
                {
                    t = ar[i-1];
                    ar[i-1] = a;
                    ar[i] = t;break;
                }
                else
                {
                    ar[i] = ar[i-1];
                }   
        }
        n = n+1;
        for (i=0;i<n;i++)
        System.out.print(ar[i]+" "); 
    }
}