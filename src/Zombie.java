import java.util.ArrayList;

public class Zombie extends HorrorCharacter
{
    String name;
    int health;
    boolean transformStatus;
    ArrayList<Vulnerabilities> vulnerabilities = new ArrayList<>();

    public Zombie()
    {
        name = "Tarman";
        health = 100;
        vulnerabilities.add(Vulnerabilities.FIRE);
        vulnerabilities.add(Vulnerabilities.FREEZING);
        vulnerabilities.add(Vulnerabilities.ELECTRICITY);
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
        System.out.println(name + " lunges at the victim, yelling 'BRAINZ!!' and eats their brains!!");
    }

    @Override
    public void flee()
    {
        System.out.println(name + " yells 'BRAINZ!!' defeated, and leaves, whilst limping.");
    }
}
