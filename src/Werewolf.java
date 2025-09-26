import java.util.ArrayList;

public class Werewolf extends HorrorCharacter implements Transformable
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
     * Constructor for Werewolf child class
     */

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
            System.out.println(name + " attacks viciously using his claws!");
        else
            System.out.println(name + " attacks using hurtful words, wounding the victim's ego!");
    }

    /**
     * Overridden flee method
     */

    @Override
    public void flee()
    {
        if (transformStatus == true)
            System.out.println(name + " howled into the night as he fled!");
        else
            System.out.println(name + " ran away at a normal human pace!");
    }

    /**
     * Overridden transform method
     */

    @Override
    public void transform()
    {
        System.out.println(name + " has been transformed by the full moon into a werewolf!");
        transformStatus = true;
    }
}
