package People;

import java.io.PrintStream;

import People.Date;

public class Person {
    private  String name;
    private Date birthday;

    public Person(String name, Date b){
        this.name = name;
        //this.birthday = birthday;
     // trying to make a copy of the date 
     		try {
     			birthday = b.clone();
     		} catch (CloneNotSupportedException e) {
     			e.printStackTrace();
     			System.out.println("This is not a date");
     		}
    }

    public void print(PrintStream ps){
    	ps.print(name + " ");
    	birthday.printDate(ps);
    }

    public Date getBirthday(){
        return birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge(Date currentDate){
        int age = 0;
        int ageCorrector =0;

        // to see if birthday has passed this year and if another year needs to be added to age
        if(currentDate.getMonth() < birthday.getMonth()) {
            ageCorrector = -1;
        } else if(currentDate.getMonth() == (birthday.getMonth())) {
            // if we are in their birthday month, has the birthday day passed yet?
            if (currentDate.getDay() < birthday.getDay()) {
                ageCorrector = -1;
            } else
                ageCorrector = 0;
        }else
        	ageCorrector = 0;

        age = currentDate.getYear() - birthday.getYear() + ageCorrector;

        return age;

    }
}
