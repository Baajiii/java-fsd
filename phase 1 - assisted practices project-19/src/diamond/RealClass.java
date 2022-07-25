package diamond;

interface test1
{  
    default void display() 
    {
        System.out.println("i am test1"); 
    } 
} 
interface test2 
{  
    default void display() 
    { 
        System.out.println("i am test2"); 
    } 
}  
public class RealClass implements test1, test2 
{  
    public void display() 
    {  
        test1.super.display(); 
        test2.super.display(); 
    } 
    public static void main(String args[]) 
    { 
        RealClass ob = new RealClass(); 
        ob.display(); 
    } 
}
