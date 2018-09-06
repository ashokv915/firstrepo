package generics;

/**
 * Created by dell on 31/8/18.
 */
public class Student {

    public <T extends Number > void print(T Mark1,T Mark2)
    {
        double result=Mark1.doubleValue()+Mark2.doubleValue();
        System.out.println("Sum is "+result);
    }

    public static void main(String[] args) {

        Student m =new Student();
        m.print(45.09f,89);
        m.print(67,89.45f);
        m.print(12,567.56f);

    }

}
