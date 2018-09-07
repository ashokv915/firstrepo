package hadoop;

import java.util.HashMap;

/**
 * Created by dell on 6/9/18.
 */
public class CountMap {
    public static void main(String[] args) {

        String s="hai Ram it is big data and hadoop is there to handle it";
        HashMap<String,Integer> count=new HashMap<>();
        String split[]=s.split(" ");
        int c=1;

        for (int i=0;i<split.length;i++)
        {

            count.put(split[i],c);

        }

    }
}
