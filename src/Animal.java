public class Animal
{
    //Instance Variables
    public String type;
    public String sound;

    //Constructor
    public Animal (String type, String sound)
    {
        this.type = type;
        this.sound = sound;
    }//End constructor

    public String getType ()
    {
        return type;
    }

    public String getSound ()
    {
        return sound;
    }

    public void setSound (String newSound)
    {
        sound = newSound;
    }
}//End class Animal
