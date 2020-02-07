
public class Main {
    public static void main(String[] args){
    	
    	// creating new dates and current date
        Date date1 = new Date(26,07,1993);
        Date date2 = new Date(20,01,1993);
        Date date3 = new Date(21,02,1958);
        Date current = new Date(25,01,2020);
        
        // testing Date class print() method
        date1.printDate(System.out);
        date2.printDate(System.out);
        
        // testing Date class diffInYears() method
        System.out.println(current.diffInYears(date1)); // 27
        System.out.println(current.diffInYears(date2)); // 27
        System.out.println(current.diffInYears(date3)); // 62
        

        // creating new people
        Person p1 = new Person("Kate",date1);
        Person p2 = new Person("Lisa",date2);
        Person p3 = new Person("Cheryl",date3);

        // testing Person class print() method
        p1.print(System.out);
        p2.print(System.out);
        p3.print(System.out);

        // testing Person class getAge() method
        System.out.println(p1.getAge(current)); // 27
        System.out.println(p2.getAge(current)); // 26
        System.out.println(p3.getAge(current)); // 61
        
        // creating new list of people
        // testing Lop class add() method
        Lop personList = new Lop(4);
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        // testing Lop class print() method
        // testing Lop class add() method
        personList.print(System.out); // prints Kate, Lisa, Cheryl and their birthdays
        
        personList.remove(p3);
        personList.print(System.out); // prints Kate and Lisa, not Cheryl
        
        // testing Lop class find() method
        											// System.out.println(personList.find("Lisa").toString()); 
        											// This prints the computer location
        Person find1 = personList.find("Lisa");
        find1.print(System.out);         

    }
}