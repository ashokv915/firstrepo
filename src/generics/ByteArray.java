package generics;

import java.io.*;

/**
 * Created by dell on 30/8/18.
 */
public class ByteArray  {
    public static void main(String[] args) throws IOException {


        String s = "Hello World";
        byte[] b = s.getBytes();
        FileOutputStream fout1 = new FileOutputStream("f1.txt");
        FileOutputStream fout2=new FileOutputStream("f2.txt");

        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        baos.write(b);
        baos.writeTo(fout1);
        baos.writeTo(fout2);


    }


}
