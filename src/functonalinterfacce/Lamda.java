package functonalinterfacce;

/**
 * Created by dell on 29/8/18.
 */
interface Drawable{
    public void draw();
}

public class Lamda  {


    public static void main(String[] args) {
        //with lamda
        int width=10;
        Drawable d2=()->{
            System.out.println("Drawing "+width);
        };
        d2.draw();
    }

}
