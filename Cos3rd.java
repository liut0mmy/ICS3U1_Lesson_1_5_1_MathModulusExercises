class Cos3rd extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // Declare variables
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblSideC;

    // Get lengths of side A, side B, and angle C
    dblSideA = readDouble ("Enter the length of side A: ");
    dblSideB = readDouble ("Enter the length of side B: ");
    dblAngleC = readDouble ("Enter the degree of angle C: ");

    // Calculate Side C = a^2 + b^2 - 2abcosC (square root)
    dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - 2 * dblSideA * dblSideB * Math.cos(dblAngleC));
    
    // Output the results
    System.out.println("Side C for this triangle is " + dblSideC);

  }
}