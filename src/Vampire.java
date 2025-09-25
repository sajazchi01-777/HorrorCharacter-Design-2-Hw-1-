import java.util.ArrayList;

public class Vampire extends HorrorCharacter implements Transformable
{
    String name;
    int health;
    boolean transformStatus;
    ArrayList<Vulnerabilities> vulnerabilities = new ArrayList<>();

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

    @Override
    public ArrayList<Vulnerabilities> getVulnerabilities()
    {
        return vulnerabilities;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public int getHealth()
    {
        return health;
    }

    @Override
    public void attack()
    {
        if (transformStatus == true)
            System.out.println(name + " attacks, flying rapidly towards the victim and sucking the blood out of their neck!");
        else
            System.out.println(name + " sucks the blood out of his victim through their neck!");
    }

    @Override
    public void flee()
    {
        if (transformStatus == true)
            System.out.println(name + " flies away into the night while squeaking defeatedly!");
        else
            System.out.println(name + " disappeared into the night and fled!");
    }

    @Override
    public void transform()
    {
        System.out.println(name + " has transformed into a bat!");
        transformStatus = true;
    }
}
