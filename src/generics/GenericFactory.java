package generics;

/**
 * Created by dell on 30/8/18.
 */
public class GenericFactory<T> {

    Class<T> c;

    public GenericFactory(Class<T> c)
    {
        this.c=c;
    }

    public Class<T> getObjectType(){
        return c;
    }

    public T getObject() throws IllegalAccessException, InstantiationException {
        try{
            return (T) getObjectType().newInstance();

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        Product p=new GenericFactory<Soap>(Soap.class).getObject();
        System.out.println(p.getName());

        Product p1=new GenericFactory<Oil>(Oil.class).getObject();
        System.out.println(p1.getName());
    }


}

class Oil extends Product{

    @Override
    public String getName() {
        return "Oil";
    }
}
