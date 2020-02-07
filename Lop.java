import java.io.PrintStream;

public class Lop {
    Person [] listOfPeople;

    // constructor
    public Lop(int i){
        listOfPeople = new Person[i];
    }
    
    // getter for list of people
    public Person[] getListOfPeople() {
    	return listOfPeople;
    }
    
    // get person object from a specific index
    public Person getPerson(int i) {
    	return listOfPeople[i];
    }

    // adds a person to the array
    public void add(Person person){
        for(int i = 0; i<listOfPeople.length; i++){
            if(listOfPeople[i]==null){
                listOfPeople[i] = person;
                break;
            }
        }
    }

    // removes a person from the array
    public void remove(Person person){
        for(int i = 0; i<listOfPeople.length; i++){
            if(listOfPeople[i]==person){
                listOfPeople[i]= null;
                break;
            }
        }
    }

    // takes a string, returns first person in the list with that name, or else returns null
    public Person find(String name){
        for(int i = 0; i<listOfPeople.length; i++){
            if(listOfPeople[i].getName().equals(name)) {
                return listOfPeople[i];
            }
        }return null;
    }
    
    public String toString(Person person) {
		return person.getName() + " " + person.getBirthday();
    }

    // prints the whole array (list of Person objects, one per line)
    public void print(PrintStream ps){
        for(int i = 0; i<listOfPeople.length; i++) {
        	 if(listOfPeople[i] != null) {
        		listOfPeople[i].print(ps);
        										//NOT ps.print(listOfPeople[i]); 
        										// this prints the computer location the object is stored at
        	}	
        }
    }
}