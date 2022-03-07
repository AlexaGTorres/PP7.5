public class animalDriver
{
    public static void main (String[] args)
    {
        //One cow, one pig, two chickens
        Animal cow = new Animal("C", 2, "cow");
        Animal pig = new Animal("P", 4, "pig");
        Animal chick1 = new Animal("C", 0, "chick");
        Animal chick2 = new Animal("Ch", 3, "chick");

        //Farmer
        //Create Farm
        Animal[] Farm = new Animal[4];
        Farm[0] = cow;
        Farm[1] = pig;
        Farm[2] = chick1;
        Farm[3] = chick2;
    }
}//End animalDriver class
