public class Cow extends Animal
{
     private String name;

    //Constructor
    public Cow (String type, String sound, String name)
    {
        super (type, sound);
        this.name = name;
    }//End constructor

    public String getName ()
    {
        return name;
    }
}//End class Cow
