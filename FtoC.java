class FtoC extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // Declare Variables
    double dblF;
    double dblC;

    // Get the Fahrenheit
    dblF = readDouble ("Enter the amount of Fahrenheit: ");

    // Calculate the amount of degrees celsius
    dblC = (dblF - 32) * 5/9;

    // Output the results
    System.out.println("The amount of degrees in celsius is: " + dblC);



    
  }
}