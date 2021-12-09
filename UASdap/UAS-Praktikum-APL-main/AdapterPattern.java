/***
 * Class AdapterPattern
 * implements interface BasicDrink
 * 
 * @author Daffaq Syafiq
 * 
 */

public class AdapterPattern implements BasicDrink {
    SweatDrink sweatDrink;

    /**
     * Method Constructor Adapter Pattern
     * 
     * @param SweatDrink
     */
    public AdapterPattern(SweatDrink sweatDrink) {
        this.sweatDrink = sweatDrink;
    }

    /**
     * Override method action interface BasicDrink
     */
    @Override
    public void basic() {
        sweatDrink.sweat();
    }
}
