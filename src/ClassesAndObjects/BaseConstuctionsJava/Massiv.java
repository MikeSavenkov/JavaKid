package ClassesAndObjects.BaseConstuctionsJava;

/**
 * Created by mikesavenkov on 7/11/17.
 */
public class Massiv {

    public static void main(String[] args){
        String players[] = new String[4];

        players[0] = "David";
        players[1] = "Daniel";
        players[2] = "Anna";
        players[3] = "Gregory";

        int totalPlayers = players.length;
        int counter=0;


        while (counter < totalPlayers){

            counter++;
            String thePlayer = players[counter];

            if (thePlayer.equals("David")){
                continue;

            }
            System.out.println("Congratulations, " + thePlayer+ "!");

        }
    }

}
