package hadoop;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dell on 3/9/18.
 */
public class StringSplitMap {
    public static void main(String[] args) {
        String s[]={"hai","hello","how","are","you","hai"};
        int count=0;
        HashMap<String,Integer> mapex=new HashMap<>();
        for (int i=0;i<s.length;i++)
        {
            count=0;
            for (int j=i+1;j<s.length;j++)
            {
                if (s[i].equals(s[j])) {
                    count++;
                }
            }
            //System.out.println(count);
            mapex.put(s[i],count+1);
        }
        for (Map.Entry obj:mapex.entrySet()){

            System.out.println("Key is "+obj.getKey());
            System.out.println("Value "+obj.getValue());

        }


    }
}
