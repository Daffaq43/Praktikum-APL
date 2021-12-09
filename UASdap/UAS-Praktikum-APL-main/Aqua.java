/***
 * Class FilmAvenger
 * implements interface BasicDrink
 * 
 * @author Daffaq Syafiq
 * 
 */


public class Aqua implements BasicDrink {

    /**
     * Override method action dari interface BasicDrink
     */
    @Override
    public void basic() {
        System.out.println("Minuman Basic");
    }

    /**
     * Method toString
     * 
     * @return Aqua
     */
    public String toString() {
        return "Aqua";
    }
}
