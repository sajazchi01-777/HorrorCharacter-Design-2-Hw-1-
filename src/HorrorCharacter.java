import java.util.ArrayList;

/**
 * Abstract parent class HorrorCharacter
 */

public class HorrorCharacter
{
    /**
     * Creating variables for name, health, as well as an array of vulnerabilities
     */

    String name;
    int health;
    ArrayList<Vulnerabilities> vulnerabilities;

    /**
     * Abstract attack method
     */

    void attack()
    {

    }

    /**
     * Abstract flee method
     */

    void flee()
    {

    }

    /**
     * @return vulnerabilities
     */

    public ArrayList<Vulnerabilities> getVulnerabilities()
    {
        return vulnerabilities;
    }

    /**
     * @return health
     */

    public int getHealth()
    {
        return health;
    }

    /**
     * @return name
     */

    public String getName()
    {
        return name;
    }
}
