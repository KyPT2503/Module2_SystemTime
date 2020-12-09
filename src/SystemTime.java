import java.util.Date;
import java.util.Scanner;

public class SystemTime
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        /**/
        Date now=new Date();
        System.out.println("now = " + now);
        /*-------------------------------------------*/

        /**/
        int i = 10;
        System.out.println("i = " + i);
        float f = 20.5f;
        System.out.println("f = " + f);
        double d = 20.5;
        System.out.println("d = " + d);
        boolean boo = true;
        System.out.println("b = " + boo);
        char c = 'a';
        System.out.println("c = " + c);
        String s = "Hà Nội";
        System.out.println("s = " + s);
        /*-------------------------------------------*/

        /**/
        float width=scanner.nextFloat();
        float height=scanner.nextFloat();
        System.out.println(width*height);
        /*-------------------------------------------*/

        /**/
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        if(a==0)
        {
            if(b==0)
            {
                System.out.println("VSN");
            }
            else
            {
                System.out.println("VN");
            }
        }
        else
        {
            System.out.println("Nghiem la " + -b/a);
        }
        /*-------------------------------------------*/

        /**/
        int month=scanner.nextByte();
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
        {
            System.out.println("31 days");
        }
        else if(month==4 || month==6 || month==9 || month==11)
        {
            System.out.println("30 days");
        }
        else
        {
            System.out.println("28 or 29 days");
        }
        /*-------------------------------------------*/

        /**/
        short year=scanner.nextShort();
        if(year%4==0)
        {
            if(year%400==0)
            {
                System.out.println("Leap year!");
            }
            else if(year%100==0)
            {
                System.out.println("Not a leap year!");
            }
            else
            {
                System.out.println("Leap year!");
            }
        }
        else
        {
            System.out.println("Not a leap year!");
        }
        /*-------------------------------------------*/

        /**/
        double weight=scanner.nextDouble();
        double height_for_BMI=scanner.nextDouble();
        double BMI=weight/Math.pow(height_for_BMI,2);
        if(BMI<18.5)
        {
            System.out.println("Underweight!");
        }
        else if(BMI<25.0)
        {
            System.out.println("Normal!");
        }
        else if(BMI<30.0)
        {
            System.out.println("Overweight!");
        }
        else
        {
            System.out.println("Obese!");
        }
        /*-------------------------------------------*/

        /**/
        String name=scanner.nextLine();
        System.out.println("Hello "+name);
        /*-------------------------------------------*/

        /**/
        double dolla=scanner.nextDouble();
        System.out.println(dolla*23000);
        /*-------------------------------------------*/
    }
}
