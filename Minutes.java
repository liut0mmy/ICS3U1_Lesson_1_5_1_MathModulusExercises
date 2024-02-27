class Minutes extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // Declare variables
    double dblMins;
    double dblDays;

    // Get amount of minutes
    dblMins = readDouble ("Enter the amount of minutes: ");

    // Calculate the number of days
    dblDays = (dblMins%1440);

    // Output results
    System.out.println("The amount of minutes left are: " + dblDays);




  }
}