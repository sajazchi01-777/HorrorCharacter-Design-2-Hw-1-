import java.util.ArrayList;

public class Zombie extends HorrorCharacter
{
    /**
     * Creating variables for name, health, as well as an array of vulnerabilities
     */

    String name;
    int health;
    ArrayList<Vulnerabilities> vulnerabilities = new ArrayList<>();

    /**
     * Constructor for Zombie child class
     */

    public Zombie()
    {
        name = "Tarman";
        health = 100;
        vulnerabilities.add(Vulnerabilities.FIRE);
        vulnerabilities.add(Vulnerabilities.FREEZING);
        vulnerabilities.add(Vulnerabilities.ELECTRICITY);
    }

    /**
     * @return vulnerabilities
     */

    @Override
    public ArrayList<Vulnerabilities> getVulnerabilities()
    {
        return vulnerabilities;
    }

    /**
     * @return name
     */

    @Override
    public String getName()
    {
        return name;
    }

    /**
     * @return health
     */

    @Override
    public int getHealth()
    {
        return health;
    }

    /**
     * Overridden attack method
     */

    @Override
    public void attack()
    {
        System.out.println(name + " lunges at the victim, yelling 'BRAINZ!!' and eats their brains!!");
    }

    /**
     * Overridden flee method
     */

    @Override
    public void flee()
    {
        System.out.println(name + " yells 'BRAINZ!!' defeated, and leaves, whilst limping.");
    }
}
