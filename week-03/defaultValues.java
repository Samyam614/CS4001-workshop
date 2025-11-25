
/**
 * Write a description of class defaultValues here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class defaultValues
{
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bb;
    public static void main(String[] args)
    {
        defaultValues o=new defaultValues();
        System.out.println("byte"+o.b);
        System.out.println("short"+o.s);
        System.out.println("int"+o.i);
        System.out.println("long"+o.l);
        System.out.println("double"+o.d);
        System.out.println("char"+o.c);
        System.out.println("boolean"+o.bb);
        //it cannot be done with local variable because the default value cannot be printed with local variable
        
        
    
    }
}