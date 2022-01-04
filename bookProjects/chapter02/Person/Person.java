
/**
 * Models a person with its general details.
 * 
 * @author Frander Calvo Rodriguez 
 * @version 29/12/2021
 */
public class Person
{
    //the name of a person
    private String name;
    // the age of a person
    private int age;
    //the profession of a person
    private String profession; 
    //the ID of a person
    private String ID; 

    /**
     * Constructor for objects of class Person
     * The name and profession must be double quoted.
     */
    public Person(String aName, int anAge, String aProfession, String anID)
    {
        // initialise instance variables
        name= aName;
        age = anAge;
        profession = aProfession; 
        ID = anID; 
    }

    //getter of the age
    public int getAge()
    {
        return age;
    }
        
    //getter of the name
    public String getName()
    {
        return name;
    }
    
    //name setter
    public void setName(String newName)
    {
        name = newName;
    }
    
    //ID getter
    public String getID()
    {
        return ID; 
    }
    
    //Shows the ID
    public void showID()
    {
        System.out.println("The ID of " + name + " is " + ID);
    }
    
}
