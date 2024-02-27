class Power extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // Declare variables
    double dblCoefficient;
    double dblVariable;
    double dblMerge;
    
    // Get the Coefficient and the variable
    dblCoefficient = readDouble("Enter the coefficient: ");
    dblVariable = readDouble("Enter the variable: ");

    // Merge the Coefficient with the variable
    dblMerge = Math.pow(dblCoefficient, dblVariable);

    //Output the results
    System.out.println("The number when the coefficient and the variable multiply is: " + dblMerge);



  }
}