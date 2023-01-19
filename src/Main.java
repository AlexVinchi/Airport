import com.skillbox.airport.Airport;
import com.skillbox.airport.Terminal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        List aicrafts = airport.getAllAircrafts();
        ArrayList terminals = (ArrayList) airport.getTerminals();

        System.out.println("===================================================");
        System.out.println("Total terminals in the airport:" + terminals.size());
        System.out.println("Total aircraft in the airport:" + aicrafts.size());
        System.out.println("===================================================");
        for(int i=0; i < aicrafts.size(); i++){
            System.out.println("Aircraft number "+ i + " is: " + aicrafts.get(i));
        }


        //System.out.println(airport.getAllAircrafts().get(0));
        //System.out.println(airport.getAllAircrafts().get(0));

        //System.out.println(airport.getAllAircrafts().get(1));
    }
}