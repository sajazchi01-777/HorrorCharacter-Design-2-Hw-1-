import java.util.ArrayList;

public class HorrorCharacterApp
{
    public static void main(String[] args)
    {
        ArrayList<HorrorCharacter> monsters = new ArrayList<>();
        ArrayList<Transformable> transformables = new ArrayList<>();

        Vampire v = new Vampire();
        Werewolf w = new Werewolf();
        Zombie z = new Zombie();

        monsters.add(v);
        monsters.add(w);
        monsters.add(z);

        transformables.add(v);
        transformables.add(w);

        System.out.println("Normal behavior (interface = false)");

        for (HorrorCharacter hc : monsters)
        {
            System.out.println(hc.getName());
            System.out.println(hc.getHealth());
            System.out.println(hc.getVulnerabilities());
            hc.attack();
            hc.flee();
        }

        System.out.println("\n Transforming applicable monsters");

        for (Transformable t : transformables)
        {
            t.transform();
        }

        System.out.println("\n Altered behavior (interface = true)");

        for (HorrorCharacter hc : monsters)
        {
            hc.attack();
            hc.flee();
        }

    }
}
