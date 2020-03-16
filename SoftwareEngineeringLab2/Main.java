import Office.Boss;
import Office.Worker;
import People.Date;
import People.Lop;
import People.Person;


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
        
        // testing Boss and Workers class
        Date date4 = new Date(23,03,1995);
        Date date5 = new Date(20,10,1991);
        Date date6 = new Date(10,05,1966);  
        
        // creating Boss's
        Boss b1 = new Boss("Chris",date4);
        Boss b2 = new Boss("Nathan",date5);
        Boss b3 = new Boss("Gareth",date6);
        
        // creating workers
        Worker w1 = new Worker("Rhys",date1,b1);
        Worker w2 = new Worker("Liam", date2,b1);
        Worker w3 = new Worker("Julia", date3,b2);
        Worker w4 = new Worker("Pedro", date1, b2);
        Worker w5 = new Worker("Mark", date1, b2);
        Worker w6 = new Worker("Merv", date5, b3);
        Worker w7 = new Worker("Anton", date6, b3);
        
        // creating a Lop and adding the Boss's and Workers to it
        Lop workerBossList = new Lop(20);
        workerBossList.add(b1);
        workerBossList.add(b2);
        workerBossList.add(b3);
        workerBossList.add(w1);
        workerBossList.add(w2);
        workerBossList.add(w3);
        workerBossList.add(w4);
        workerBossList.add(w5);
        workerBossList.add(w6);
        workerBossList.add(w7);
        
        // printing every person in the workerBossList
        workerBossList.print(System.out);
    }
}