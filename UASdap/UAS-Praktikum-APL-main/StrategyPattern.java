/***
 * Class StrategyPattern
 * 
 * @author Daffaq Syafiq
 * 
 */

public class StrategyPattern {
    private BasicDrink basicDrink;

    /**
     * Method setter setBasicDrink
     * 
     * @param basicDrink
     */
    public void setBasicDrink(BasicDrink basicDrink) {
        this.basicDrink = basicDrink;
    }

    /**
     * Method getter getBasicDrink
     * 
     * @return BasicDrink
     */
    public BasicDrink getBasicDrink() {
        return this.basicDrink;
    }

    /**
     * Method action untuk memanggil method action kepunyaan atribut BasicDrink
     */
    public void basic() {
        basicDrink.basic();
    }
}
