package Excerise;

// Before Retactoring
/*class Shape
{
    public double calculateArea(String shapeType , double p1 , double p2)
    {
        double area = 0.0;

        if(shapeType.equalsIgnoreCase("Circle"))
        {
            double radius = p1;
            area = 3.14 * radius * radius;
        }
        
        else if(shapeType.equalsIgnoreCase("Rectangle"))
        {
            double height = p1;
            double weight = p2;
            area = height * weight;
        }

        return area;
    }
}
public class OpenClosedPrinciple
{
    public static void main(String[] args) 
    {
        Shape sh = new Shape();
        System.out.println(sh.calculateArea("Circle" , 1 , 0));

        Shape sh1 = new Shape();
        System.out.println(sh1.calculateArea("Rectangle" , 1 , 3));

    }
}*/

// After Refactoring 
//abstract class 
public class OpenClosedPrinciple
{
    public static void main(String [] args)
    {

    }
}
