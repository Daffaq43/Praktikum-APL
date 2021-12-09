/***
 * Class FilmIronMan
 * implements interface BasicDrink
 * 
 * @author Daffaq Syafiq
 * 
 */

public class Susu implements BasicDrink {

    /**
     * Override method basic dari interface BasicDrink
     */
    @Override
    public void basic() {
        System.out.println("Minuman Basic");
    }

    /**
     * Method toString
     * 
     * @return susu
     */
    public String toString() {
        return "Susu";
    }
}
