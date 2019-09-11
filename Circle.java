public class Circle 
{
   public static void main (String[] args)
   {
      double radius, area, circumference;
      
      radius = 100;
      
      area = 3.142*radius*radius;
      circumference = 2*radius*3.142;
      
      System.out.print("The area of this circle is " + area +
                        " and the circumference of the circle is " + circumference);
   }
}