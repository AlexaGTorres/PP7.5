public class Farmer
{
 private final String name;

    public Farmer (String name)
    {
        this.name = name;
    }

    public String getName ()
    {
        return name;
    }

    public String toString (Animal i)
    {
        String output = name + " had a farm, E-I-E-I-O!" +
                "\nAnd on that farm he had a " + i.getType() + ", E-I-E-I-O!" +
                "\nWith a " + i.getSound() + "-" + i.getSound() + "here, " +
                "and a " + i.getSound() + "-" + i.getSound() + " there, " +
                "\nHere a " + i.getSound() + ", there a " + i.getSound() + " everywhere a " + i.getSound() + "-" + i.getSound() +
                "\n" + name + " had a farm, E-I-E-I-O!";
        return output;
    }
}//End class Farmer
