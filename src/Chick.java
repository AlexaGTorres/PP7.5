public class Chick extends Animal
{
    //Instance Variables
    private int age;

    //Constructor
    public Chick (String type, String sound, int age)
    {
        super (type, sound);
        this.age = age;
    }//End constructor

    public int getAge ()
    {
        return age;
    }
}//End class Chick
