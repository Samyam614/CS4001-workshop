import java.util.Scanner;

/**
 * Write a description of class grade_evaluater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class grade_evaluater
{
  public static void main(String[] args)
  {
      int n;
      Scanner scan=new Scanner(System.in);
      System.out.println("please enter your grade");
      n=scan.nextInt();
      String message=( n>= 40)
      ?"pass"
      :"fail";
      System.out.println(message);
  }

}