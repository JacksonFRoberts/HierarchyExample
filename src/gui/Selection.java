/*
  This code can be updated in TWO places. Look for the comments
  in the code that specify where additions should be made.

   (1) Add character names to the selectedOptions ArrayList.
   These names are used to populate the dropdown menu.
   (2) Add additional else-if statements to setCharacter.
   The else-if blocks set the text and image to display for
   the selected character.
 */
package gui;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import heroes.*;
import villains.Carnage;
import villains.DrDoom;
import villains.Sandman;

public class Selection {

    private static ImageIcon image;
    private static String text;

    public static ArrayList<String> selectionOptions()
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Drax");
        names.add("Gamora");
        names.add("Groot");
        names.add("Rocket");
        names.add("Star Lord");
        names.add("Captain America");
        names.add("Doctor Strange");
        names.add("Falcon");
        names.add("Iron Man");
        names.add("Nick Fury");
        names.add("Spider Man");
        names.add("Vision");
        names.add("Wanda");
        names.add("Winter Solder");
        names.add("Hawkeye");
        names.add("Hulk");
        names.add("War Machine");
        names.add("Carnage");
        names.add("Dr. Doom");
        names.add("Galactus");
        names.add("Maphisto");
        names.add("Rhino");
        names.add("Sandman");
        names.add("Thanos");
        // 1. ADD MORE NAMES TO THE LIST HERE:
        names.add("Mystique");
        names.add("Electro");
        names.add("RedSkull");
        // END OF PART 1
        names.sort(null);
        names.add(0, "Make a selection");
        return names;
    }

    public static void setCharacter(JLabel theLbl, String selectedName) {
        String theText = null;
        ImageIcon theImage = null;
        if (selectedName.equals("Captain America"))
        {

        }
        if (selectedName.equals("Carnage"))
        {
            Carnage theCharacter = new Carnage("Carnage", "Symbiote Powers");
            theText = theCharacter.toString() + "\n" + theCharacter.doEvilDeed();
            theImage = null;
        }
        else if (selectedName.equals("Doctor Strange"))
        {

        }
        else if (selectedName.equals("Drax"))
        {
            Drax theCharacter = new Drax();
            theText = theCharacter + "\nQuote: " + theCharacter.getQuote();
            theImage = ImageLoader.setImage(theCharacter.getImageFileName());
        }
        else if (selectedName.equals("Dr Doom"))
        {
            DrDoom theCharacter = new DrDoom("Dr. Doom", "Dark mysticism and sorcery");
            theText = theCharacter.toString() + "\n" + theCharacter.doEvilDeed();
            theImage = null;
        }
        else if (selectedName.equals("Falcon"))
        {

        }
        else if (selectedName.equals("Galactus"))
        {

        }
        else if (selectedName.equals("Gamora"))
        {
            Gamora theCharacter = new Gamora();
            theText = theCharacter + "\nQuote: " + theCharacter.getQuote();
            theImage = ImageLoader.setImage(theCharacter.getImageFileName());
        }
        else if (selectedName.equals("Groot"))
        {
            Groot theCharacter = new Groot();
            theText = theCharacter + "\nQuote: " + theCharacter.getQuote();
            theImage = ImageLoader.setImage(theCharacter.getImageFileName());
        }
        else if (selectedName.equals("Hawkeye"))
        {

        }
        else if (selectedName.equals("Hulk"))
        {

        }
        else if (selectedName.equals("Iron Man"))
        {

        }
        else if (selectedName.equals("Maphisto"))
        {

        }
        else if (selectedName.equals("Nick Fury"))
        {

        }
        else if (selectedName.equals("Rhino"))
        {

        }
        else if (selectedName.equals("Rocket"))
        {
            Rocket theCharacter = new Rocket();
            theText = theCharacter + "\nQuote: " + theCharacter.getQuote();
            theImage = ImageLoader.setImage(theCharacter.getImageFileName());
        }
        else if (selectedName.equals("Sandman"))
        {
            Sandman theCharacter = new Sandman("Sandman", "Sand Transformation");
            theText = theCharacter.toString() + "\n" + theCharacter.doEvilDeed();
            theImage = null;
        }
        else if (selectedName.equals("Spider Man"))
        {

        }
        else if (selectedName.equals("Star Lord"))
        {
            StarLord theCharacter = new StarLord();
            theText = theCharacter + "\nQuote: " + theCharacter.getQuote();
            theImage = ImageLoader.setImage(theCharacter.getImageFileName());
        }
        else if (selectedName.equals("Thanos"))
        {

        }
        else if (selectedName.equals("Vision"))
        {

        }
        else if (selectedName.equals("Wanda"))
        {
            Wanda theCharacter = new Wanda("Wanda", "Magic");
            theText = theCharacter.toString() + "\n" + theCharacter.fly();
            theImage = null;
        }
        else if (selectedName.equals("War Machine"))
        {

        }
        else if (selectedName.equals("Winter Soldier"))
        {

        }



       else if (selectedName.equals("Rocket"))
       {

       }
       else if (selectedName.equals("Star Lord")) {

       }
       else if (selectedName.equals("Wanda")) {

       }
       else if (selectedName.equals("Dr. Doom")) {

       }
       // 2. Add more else-if statements here for new characters:

        // END OF PART 2S
        // DO NOT MAKE ANY CODE CHANGES BELOW THIS LINE.
        theLbl.setIcon(theImage);
        if (theText != null) {
            theLbl.setText(getTextAsHTML(theText));
        } else {
            theLbl.setText("Coming soon...our developers are working hard to update this content.");
        }
    }

    private static String getTextAsHTML(String text) {
        return  "<html>"
                + text.replaceAll("\n", "<br />")
                + "</html>";
    }
}
