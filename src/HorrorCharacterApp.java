import java.util.ArrayList;

public class HorrorCharacterApp
{
    /**
     * Main program
     * @param args
     */

    public static void main(String[] args)
    {
        /**
         * Creating array list of both the parent class HorrorCharacters and the interface Transformable
         */

        ArrayList<HorrorCharacter> monsters = new ArrayList<>();
        ArrayList<Transformable> transformables = new ArrayList<>();

        /**
         * Instantiation of child class objects
         */

        Vampire v = new Vampire();
        Werewolf w = new Werewolf();
        Zombie z = new Zombie();

        /**
         * Adding child objects to the HorrorCharacter array
         */

        monsters.add(v);
        monsters.add(w);
        monsters.add(z);

        /**
         * Adding transformable monsters only to the Transformable array
         */

        transformables.add(v);
        transformables.add(w);

        /**
         * For loop that prints out the name, health, and vulnerabilities of each monster
         * Preforms the attack and flee methods for each monster
         */

        System.out.println("Normal behavior (interface = false)");

        for (HorrorCharacter hc : monsters)
        {
            System.out.println(hc.getName());
            System.out.println(hc.getHealth());
            System.out.println(hc.getVulnerabilities());
            hc.attack();
            hc.flee();
        }

        /**
         * Transforming monsters which have the transform method implemented from the interface
         */

        System.out.println("\n Transforming applicable monsters");

        for (Transformable t : transformables)
        {
            t.transform();
        }

        /**
         * Going through the attack and flee methods of the transformed monsters
         * These methods are different to the untransformed method behavior
         */

        System.out.println("\n Altered behavior (interface = true)");

        for (HorrorCharacter hc : monsters)
        {
            hc.attack();
            hc.flee();
        }
    }
}
