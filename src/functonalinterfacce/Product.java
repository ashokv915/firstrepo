package functonalinterfacce;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by dell on 29/8/18.
 */
public class Product {
    int pid,price;
    String pname;

    public Product(int pid, int price, String pname) {
        this.pid = pid;
        this.price = price;
        this.pname = pname;
    }

    public static void main(String[] args)
    {
        ArrayList<Product> al=new ArrayList<>();
        al.add(new Product(123,400,"A"));
        al.add(new Product(124,500,"B"));
        al.add(new Product(125,600,"C"));

        Stream<Product> s=al.stream();
        s.forEach(m->{
            System.out.println("Product id "+m.pid+" Product Price "+m.price+" Product name "+m.pname);
        });
    }




}
