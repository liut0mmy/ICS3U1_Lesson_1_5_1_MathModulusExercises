class Hours extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // Declare variables
    double dblHours;
    double dblDays;

    // Get the amount of hours
    dblHours = readDouble("Enter the amount of hours: ");

    // Caclculate the amount of days
    dblDays = (dblHours%24);

    // Output the results
    System.out.println("The amount of hours left is: " + dblDays);
  }
}