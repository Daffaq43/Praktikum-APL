/***
 * Class 
 * implements interface SweetDrink
 * class ini dibuat agar dapat dilakukan dan diterapkan adapter pattern
 * 
 * @author Daffaq Syafiq
 * 
 */

public class Fanta implements SweatDrink {

    /**
     * Override method romance dari interface SweetDrink
     */
    @Override
    public void sweat() {
        System.out.println("Minuman Manis");
    }
}
