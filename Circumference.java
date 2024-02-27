class Circumference extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // Declare variables
    double dblRadius;
    double dblCircumference;

    // Get length of radius
    dblRadius = readDouble("Enter the length of the radius: ");

    // Calculate the circle
    dblCircumference = (2 * Math.PI * dblRadius);

    // Output the results
    System.out.println("The Circumference of the circle is: " + dblCircumference);

    

  }
}