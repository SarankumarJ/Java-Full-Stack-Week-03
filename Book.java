import java.util.Scanner;

abstract class Book
{
    String title;
    abstract void setTitle(String s);
    String getTitle()
    {
        return title;
    }
}
class MyBook extends Book
{
    void setTitle(String s)
    {
        title = s;
    }
}
class JavaAbstract
{
    public static void main(String []args)
    {
        Scanner a = new Scanner(System.in);
        String title = a.nextLine();
        MyBook boo = new MyBook();
        boo.setTitle(title);
        System.out.println("The Title is: "+boo.getTitle());
    }
}
