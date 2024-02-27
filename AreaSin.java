class AreaSin extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // Declare variables
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblArea;

    // Get lengths of side A, side B, and angle C
    dblSideA = readDouble("Enter the length of Side A: ");
    dblSideB = readDouble("Enter the length of Side B: ");
    dblAngleC = readDouble("Enter the degree of Angle C: ");

    // Calculate the area of the triangle
    dblArea = (dblSideA * dblSideB * Math.sin(dblAngleC)) / 2;

    // Output the results
    System.out.println("The area of the triangle is: " + dblArea);


    
  }
}