package annotations;

import java.lang.reflect.Method;

/**
 * Created by dell on 27/8/18.
 */
public class StudentAnnotation {

    @College(name = "SH College", locaton = "Tevara")
    public void getInfo()
    {

    }
    public static void main(String[] args)
    {
        try
        {
            Method m=StudentAnnotation.class.getMethod("getInfo");
            College collegeAnnotation = (College) m.getAnnotation(College.class);
            if (collegeAnnotation !=null)
            {
                System.out.println("Name : " +collegeAnnotation.name());
                System.out.println("Age :"+collegeAnnotation.locaton());
                System.out.println("-----------------------");
            }

        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException");
        }
    }


}
