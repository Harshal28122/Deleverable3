/** Populating.java
* @author Harshal and Sagar
* @version 1.0 Date August 9th,2019
*/

/** This are the importing statements  */
import java.util.Random;

/** This is the Main Class  */
public class PopulatingDeck
{
   /**@param  value This is the parameter */
    public int value;
    /**@param  rand This is the parameter */
    private Random rand;
    /**@param  color This is the parameter */
    private String face;
    /**@param  face This is the parameter */
    String color;

    public PopulatingDeck(int v, String c)
    {
        value = v;
        color = c; 
    }

    // Creates a random card
    public PopulatingDeck()
    {
        rand = new Random();
        value = rand.nextInt(28); // 108 cards in a standard Uno deck. Can be reduced to 27 (disregarding colors)
        // Assigning value
        if (value >= 14) // Some cards are more common than others
            value -= 14;
        // Assigning color
        rand = new Random();
        switch(rand.nextInt(4) )
        {
            case 0: color = "Red"; 
                break;
            case 1: color = "Green"; 
                break;
            case 2: color = "Blue"; 
                break;
            case 3: color = "Yellow"; 
                break;
        }
        // If the card is a wild card
        if (value >= 13)
            color = "none";
    }

    public String getFace()
    {
        /* Returns the face of the card (what the player sees)
         * Ex. [Red 5]
         */
        face = "[";
        if (color != "none")
        {
            face += this.color + " ";
        }

        switch(this.value)
        {
            default: face += String.valueOf(this.value); 
                break;
            case 10: face += "Skip"; 
                break;
            case 11: face += "Reverse"; 
                break;
            case 12: face += "Draw 2"; 
                break;
            case 13: face += "Wild"; 
                break;
            case 14: face += "Wild Draw 4"; 
                break;
        }
        face += "]";
        return face;
    }

    // Determines if you can place this card on top of a given card
    // The color needs to be specified because if a wild card was chosen in the previous round, the color would have changed, but the card staying the same
    public boolean canPlace(PopulatingDeck o, String c)
    {
        if (this.color == c)
            return true;
        else if (this.value == o.value)
            return true;
        else if (this.color == "none") // Wild cards
            return true;
        return false;
    }
}
// End of the program