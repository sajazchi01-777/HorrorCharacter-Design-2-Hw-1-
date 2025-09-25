import java.util.ArrayList;

public class Werewolf extends HorrorCharacter implements Transformable
{
    String name;
    int health;
    boolean transformStatus;
    ArrayList<Vulnerabilities> vulnerabilities = new ArrayList<>();

    public Werewolf()
    {
       name = "Jacob Black";
       health = 100;
       vulnerabilities.add(Vulnerabilities.SILVER);
       vulnerabilities.add(Vulnerabilities.WOLFSBANE);
       vulnerabilities.add(Vulnerabilities.HOLY_WATER);
       vulnerabilities.add(Vulnerabilities.CRUCIFIX);
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
            System.out.println(name + " attacks viciously using his claws!");
        else
            System.out.println(name + " attacks using hurtful words, wounding the victim's ego!");
    }

    @Override
    public void flee()
    {
        if (transformStatus == true)
            System.out.println(name + " howled into the night as he fled!");
        else
            System.out.println(name + " ran away at a normal human pace!");
    }

    @Override
    public void transform()
    {
        System.out.println(name + " has been transformed by the full moon into a werewolf!");
        transformStatus = true;
    }
}
