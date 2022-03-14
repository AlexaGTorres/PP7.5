public class Chick extends Animal
{
    //Instance Variables
    private int age;
    private boolean canPeep;
    private boolean canCheep;

    //Constructor
    public Chick (String name, String type, String sound, int age, boolean canPeep, boolean canCheep)
    {
        super (name, type, sound);
        this.age = age;
        this.canPeep = canPeep;
        this.canCheep = canCheep;
    }//End constructor

    public boolean getCanPeep ()
    {
        return canPeep;
    }

    public boolean getCanCheep ()
    {
        return canCheep;
    }
}//End class Chick
