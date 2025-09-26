import java.util.ArrayList;

public class Vampire extends HorrorCharacter implements Transformable
{
    /**
     * @param name
     * @param health
     * @param transformStatus
     * @param vulnerabilities
     */

    String name;
    int health;
    boolean transformStatus;
    ArrayList<Vulnerabilities> vulnerabilities = new ArrayList<>();

    /**
     * Constructor for the Vampire child class
     */

    public Vampire()
    {
        name = "Dracula";
        health = 100;
        vulnerabilities.add(Vulnerabilities.SUNLIGHT);
        vulnerabilities.add(Vulnerabilities.HOLY_WATER);
        vulnerabilities.add(Vulnerabilities.CRUCIFIX);
        vulnerabilities.add(Vulnerabilities.GARLIC);
        vulnerabilities.add(Vulnerabilities.FIRE);
        vulnerabilities.add(Vulnerabilities.SALT);
        transformStatus = false;
    }

    /**
     * Overridden getter for vulnerabilities
     * @return
     */

    @Override
    public ArrayList<Vulnerabilities> getVulnerabilities()
    {
        return vulnerabilities;
    }

    /**
     * Overridden getter for name
     * @return
     */

    @Override
    public String getName()
    {
        return name;
    }

    /**
     * Overridden getter for health
     * @return
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
        if (transformStatus == true)
            System.out.println(name + " attacks, flying rapidly towards the victim and sucking the blood out of their neck!");
        else
            System.out.println(name + " sucks the blood out of his victim through their neck!");
    }

    /**
     * Overridden flee method
     */

    @Override
    public void flee()
    {
        if (transformStatus == true)
            System.out.println(name + " flies away into the night while squeaking defeatedly!");
        else
            System.out.println(name + " disappeared into the night and fled!");
    }

    /**
     * Overridden transform interface
     */

    @Override
    public void transform()
    {
        System.out.println(name + " has transformed into a bat!");
        transformStatus = true;
    }
}
