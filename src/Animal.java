public class Animal
{
    //Instance Variables
    public String name;
    public String type;
    public String sound;

    //Constructor
    public Animal (String name, String type, String sound)
    {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }//End constructor

    public String getName ()
    {
        return name;
    }

    public String getType ()
    {
        return type;
    }

    public String getSound ()
    {
        return sound;
    }
}//End class Animal
