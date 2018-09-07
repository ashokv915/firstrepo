package hadoop;

import java.util.HashMap;

/**
 * Created by dell on 6/9/18.
 */
public class SplitComma {

    public static void main(String[] args) {

        String s1="Ram is, a java developer";
        String s2="Ram is, a hadoop analyst";

        String s1split[]=s1.split(",");
        String s2split[]=s2.split(",");

        String s1split1[]=s1split[0].split(" ");
        String s1split2[]=s1split[1].split(" ");

        String s2split1[]=s2split[0].split(" ");
        String s2split2[]=s2split[1].split(" ");

       System.out.println(s1split1[0]+ " "+s1split2[2]+" "+s1split2[3]);
        System.out.println(s2split1[0]+" "+s2split2[2]+" "+s2split2[3]);

    }

}
