import java.util.Scanner;

/**
 * Represents a triangle object containing a name, base dimension,
 * and height dimension along with methods to calculate area and 
 * handle console input/output
 * 
 *@author Angie Messer
 *@v1.0
 *@since 10/9/2026
 */
public class Triangle {
    //Field Vars
    private String name;
    private double base;
    private double height;
    
    //Constructors
    public Triangle(){ //no-arg constructor
        name = "Unknown";
        base = 0.0;
        height = 0.0;
    }
    /** Constructor that accepts a name, base and height to 
     * initialize the triangle's instance fields. 
     *@param inName The initial name of the triangle
     *@param inBase The initial base dimension of triangle
     *@param inHeight The inital height dimension of triangle
     */
    public Triangle(String inName, double inBase, double height) {
        name = inName;
        base = inBase;
        this.height = height; 
    }
    
    public void writeOutput() {
        System.out.println("Triangle name is: " + name);
        System.out.printf("Triangle base is: %.1f%n", base);
        System.out.printf("Triangle height is %.1f%n", height);
        System.out.printf("Triangle area is %.1f%n", getArea());
    }
    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What is the triangle's name: ");
        this.name = keyboard.nextLine();
        
        System.out.print("What is the triangle's base: ");
        this.base = keyboard.nextDouble();
        
        System.out.print("What is the triangle's height: ");
        this.height = keyboard.nextDouble();
    }
    /** Sets a new name for the triangle
     * 
     * @param newName The new name to assign
     */
    public void setName(String newName){
        name = newName;
    }
    /** 
     * Sets a new base dimension for the triangle
     * 
     * @param newBase The new base dimension to assign
     */
    public void setBase(double newBase){
        base = newBase;
    }
    /** 
     * Sets a new height dimension for the triangle
     * 
     * @param newHeight The new height dimension to assign
     */
    public void setHeight(double newHeight){
        height = newHeight;
    }
    
    /**
     * Helper method to calculate the area of the triangle
     * 
     * @return The calculated area as a double
     */
    private double getArea(){
        return (0.5 * base * height);
    }
}