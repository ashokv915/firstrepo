package hadoop;

/**
 * Created by dell on 3/9/18.
 */
public class SplitingString {

    public static void main(String[] args) {

        String s="hai Ram it is big data and hadoop is there to handle it";
        String array[]=s.split(" ");
        String rep[]=new String[20];
        int k=0;
        for (int i=0;i<array.length;i++)
        {
            k=0;
            for (int j=i+1;j<array.length;j++)
            {
                if (array[i].equals(array[j]))
                {

                    System.out.print(array[j] +" Count is ");
                    if (array[j].equals(array[j]))
                    {
                        k++;
                    }

                }
                if (k!=0)
                {
                System.out.println(k+1);
                k=0;
                }

            }
            //System.out.println(k+array[i]);

        }


    }
}
