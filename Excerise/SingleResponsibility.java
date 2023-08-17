package Excerise;

/*  before refactoring

class All
{
    public void Teacher(String name , String id)
    {
        System.out.println("VC has approved");
        System.out.println("Meeting Time : 12:00");
    }

    public void Student(String name , String depart)
    {
        System.out.println("VC hasn't approved");
    }

}*/

// after refactoring

class Teacher
{
    public void TeacherInfo(String name , String id)
    {
        System.out.println("VC has approved");
        System.out.println("Meeting Time : 12:00");
    }
}

class Student
{
    public void StudentInfo(String name , String dapart)
    {
        System.out.println("VC hasn't approved");
    }
}
// ? Do google for more Example.
public class SingleResponsibility
{
    public static void main(String[] args) 
    {
       Teacher t = new Teacher();
       t.TeacherInfo(null,null);

       Student s = new Student();
       s.StudentInfo(null, null);
    }
}