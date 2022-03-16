public class animalDriver
{
    public static void main (String[] args)
   {
      //Farmer, one cow, one pig, two chicks

       Farmer farmer  = new Farmer ("Old MacDonald");

       Animal cow = new Cow ("cow", "moo", "Peach");

       Animal pig = new Pig ("pig", "pig", "oink");

       Animal chick = new Chick ("chick", "", 0);
       Animal chickFriend = new Chick ("chick", "", 3);

       Animal[] myFarm = new Animal[4];
       myFarm[0] = cow;
       myFarm[1] = pig;
       myFarm[2] = chick;
       myFarm[3] =  chickFriend;

       for (Animal i : myFarm)
       {
           if (i.getType().equals("chick"))
           {
               if (i.getAge() <= 1)
               {
                   i.setSound("peep");
               }
               else
               {
                   i.setSound("cheep");
               }
           }
           System.out.println (farmer.toString(i));
           System.out.println ("\n");
       }
   }
}//End animalDriver class
