package functonalinterfacce;

/**
 * Created by dell on 29/8/18.
 */
interface Drawable{
    public void draw(String name, int z);
}

public class Lamda  {


    public static void main(String[] args) {
        //with lamda
        int width=10;
        Drawable d2=(x,y)->{
            System.out.println("Drawing "+width+" name "+x+" Number "+y);
        };
        d2.draw("circle",2);
    }

}
