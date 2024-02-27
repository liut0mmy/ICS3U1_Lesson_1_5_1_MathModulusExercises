class KM_to_Miles extends ConsoleProgram {

/**
* Description
* @author:
*/

    public void run() {

    // Declare Variables
    double dblKm;
    double dblMiles;

    // Get the amount of kilometers
    dblKm = readDouble ("Enter the amount of kilometers: ");

    // Calculate kilometers to miles
    dblMiles = (dblKm * 0.621371);

    // Out the results
    System.out.println("The amount of miles is: " + dblMiles);


    }
}