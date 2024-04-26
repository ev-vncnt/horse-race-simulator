package Part1;
/*
 * Write a description of class Horse here.
 * 
 * @author Eve Vincent
 * @version 1
 */

public class Horse
{
    //Fields of class Horse
    
    private String horseName;
    private char horseSymbol;
    private int distance;
    private boolean hasFallen;
    private double horseConfidence;
    
      
    //Constructor of class Horse
    /**
     * Constructor for objects of class Horse
     */
    public Horse(char horseSymbol, String horseName, double horseConfidence)
    {
        this.horseSymbol = horseSymbol;
        this.horseName = horseName;
        this.horseConfidence = horseConfidence;
        this.distance = 0; // Initialise distance to 0
        this.hasFallen = false; // Initialise hasFallen to false
    }
    
    //Other methods of class Horse
    public double getConfidence()
    {
        return this.horseConfidence;
    }
    
    public int getDistanceTravelled()
    {
        return this.distance;
    }
    
    public String getName()
    {
        return horseName;
    }
    
    public char getSymbol()
    {
        return horseSymbol;
    }
    
    public boolean hasFallen()
    {
        return this.hasFallen;
    }

    public void fall()
    {
        this.hasFallen = true;
    }

    public void goBackToStart()
    {
        distance = 0;
    }

    public void moveForward()
    {
        this.distance += 1;
    }

    public void setConfidence(double newConfidence)
    {
        this.horseConfidence = newConfidence;
    }
    
    public void setSymbol(char newSymbol)
    {
        this.horseSymbol = newSymbol;
    }


    public static void main(String [] a)
    {
        return;
    }

    public static void runTest()
    {
        String newLine = "\n--------------------\n";
        Horse testHorse = new Horse('A', "Axel", 0.7);
        
        System.out.println("\nAccessor Methods:");

        System.out.println(newLine + "Test getConfidence(): ");
        System.out.println("Confidence: " + testHorse.getConfidence());

        System.out.println(newLine + "Test getDistanceTravelled():");
        System.out.println("Distance: " + testHorse.getDistanceTravelled());

        System.out.println(newLine + "Test getName():");
        System.out.println("Name: " + testHorse.getName());

        System.out.println(newLine + "Test getSymbol():");
        System.out.println("Symbol: " + testHorse.getSymbol());

        System.out.println(newLine + "Test hasFallen():");
        System.out.println("Has Fallen: " + testHorse.hasFallen());

        System.out.println("\nMutator Methods: ");

        System.out.println(newLine + "Test fall(): ");
        System.out.println("Has fallen? ");
        System.out.println("Expected output: True");
        testHorse.fall();
        System.out.println("Actual Output: " + testHorse.hasFallen);

        System.out.println(newLine + "Test moveForward(): ");
        System.out.println("Distance travelled?");
        System.out.println("Expected output: 2");
        testHorse.moveForward();
        testHorse.moveForward();
        System.out.println("Actual Output: " + testHorse.getDistanceTravelled());
        
        System.out.println(newLine + "Test goBackToStart(): ");
        System.out.println("Distance travelled? ");
        System.out.println("Expected output: 0");
        testHorse.goBackToStart();
        System.out.println("Actual Output: " + testHorse.getDistanceTravelled());

        System.out.println(newLine + "Test setSymbol(char): ");
        System.out.println("Horse symbol?");
        System.out.println("Expected output: X");
        testHorse.setSymbol('X');
        System.out.println("Actual Output: " + testHorse.getSymbol());

        System.out.println(newLine + "Test setConfidence(double): ");
        System.out.println("Horse confidence?");
        System.out.println("Expected output: 0.3");
        testHorse.setConfidence(0.3);
        System.out.println("Actual Output: " + testHorse.getConfidence());

        System.out.println("\nTests Complete.\n");


    }
}
