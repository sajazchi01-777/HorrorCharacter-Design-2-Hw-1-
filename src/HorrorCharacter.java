import java.util.ArrayList;

/**
 * Abstract parent class HorrorCharacter
 */

public class HorrorCharacter
{
    /**
     * @param name
     * @param health
     * @param vulnerabilities
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
     * Getter for the vulnerabilities
     * @return
     */

    public ArrayList<Vulnerabilities> getVulnerabilities()
    {
        return vulnerabilities;
    }

    /**
     * Getter for health
     * @return
     */

    public int getHealth()
    {
        return health;
    }

    /**
     * Getter for name
     * @return
     */

    public String getName()
    {
        return name;
    }
}
