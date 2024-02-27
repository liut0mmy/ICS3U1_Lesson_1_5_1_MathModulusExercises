class Rads extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // Declare Variables
    double dblDeg;
    double dblRad;

    // Get the amount of degrees
    dblDeg = readDouble ("Enter the amount of degrees: ");

    // Calculate degrees to radians
    dblRad = dblDeg * 0.0174533;

    // Output results
    System.out.println("The amount of radians is: " + dblRad);
    
  }
}