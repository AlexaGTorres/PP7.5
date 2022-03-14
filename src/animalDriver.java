public class animalDriver
{
    public static void main (String[] args)
   {
       //Farmer, one cow, one pig, two chicks

       Farmer farmer  = new Farmer ("Old MacDonald");

       Animal cow = new Cow ("John", "cow", "moo");

       Animal pig = new Pig ("Oscar", "pig", "oink");

       Animal chick = new Chick ("Peach", "chick", "peep", 0, true, false);
       Animal chickFriend = new Chick ("Bee", "chick", "cheep",3, false, true);

       Animal[] myFarm = new Animal[4];
       myFarm[0] = cow;
       myFarm[1] = pig;
       myFarm[2] = chick;
       myFarm[3] =  chickFriend;

       for (Animal element : myFarm)
       {
           System.out.print (farmer.getName() + " had a farm, E-I-E-I-O! " +
                   "\nAnd on that farm he had a " + element.getType() + ", E-I-E-I-O!" +
                   "\nWith a " + element.getSound() + "-" + element.getSound() + " here and a " + element.getSound() + "-" + element.getSound() + " there," +
                   "\nHere a " + element.getSound() + ", there a " + element.getSound() + ", everywhere " + element.getSound() + "-" + element.getSound() + "" +
                   "\n" + farmer.getName() + " had a farm, E-I-E-I-O!");
           System.out.println ("\n");
       }
   }
}//End animalDriver class
