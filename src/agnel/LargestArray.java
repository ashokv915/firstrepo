package agnel;

import java.util.ArrayList;

/**
 * Created by dell on 14/8/18.
 */
public class LargestArray {

    public static void main(String[] args) {

        int lar;

        int a[] = {10,74,30,46,20,36,78,45};
        int first=a[0];
        int second=a[0];
        //First Max
       for (int i=0;i<a.length;i++)
       {
           if (a[i]>first)
           {
               first=a[i];
           }
       }
        System.out.println(first);
       //Second Max
       for (int i=0;i<a.length;i++)
       {
           if ((a[i]>second)&&(a[i]<first))
           {
               second=a[i];
           }
       }
        System.out.println(second);

       //Array Split
        ArrayList<Integer> arli=new ArrayList<>();
        for (int i=0;i<(a.length/2);i++)
        {
            arli.add(a[i]);
        }
        ArrayList<Integer> arli2=new ArrayList<>();
        for(int i=(a.length/2);i<a.length;i++)
        {
            arli2.add(a[i]);
        }
        System.out.println("First Half");
        for (int obj:arli)
        {
            System.out.println(obj);
        }
        System.out.println("Second Half");
        for (int obj:arli2)
        {
            System.out.println(obj);
        }

    }



}
