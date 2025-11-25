import java.util.Scanner;

/**
 * Write a description of class rickshawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rickshawFare
{
    public static void main(String args[])
    {   
        int km;
        int min;
        double price;
        double fp;
        String loc;
        String night;
        String ni;
        Scanner dis=new Scanner(System.in);
        System.out.println("enter the distance in km"); 
         km=dis.nextInt();
    Scanner time=new Scanner(System.in);
        System.out.println("enter the time in minutes"); 
         min=time.nextInt();
         price=20*km+10*min;
         System.out.println("your price is Rs."+price);
        Scanner dec=new Scanner(System.in);
        System.out.println("Is the cutomer local? yes/no"); 
         loc=dec.next();
          double message=(loc.equals("yes"))
        ? (fp= price - 0.1*price ): (fp= price);
        System.out.println("the price after discount is Rs." +message);
        Scanner nigh=new Scanner(System.in);
        System.out.println("Is the travel at night? yes/no"); 
         ni=nigh.next();
          double messages=(ni.equals("yes"))
        ? (fp= fp + 0.1*fp ): (fp) ;
        System.out.println("the final price is Rs." +messages);
        
    }
}