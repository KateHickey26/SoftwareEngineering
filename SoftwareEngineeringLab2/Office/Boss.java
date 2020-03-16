package Office;

import java.io.PrintStream;

import People.Date;
import People.Lop;
import People.Person;

public class Boss extends Person {
    Lop workers = new Lop(10);
    int wIndex = 0;

    public Boss(String name, Date birthday) {
        super(name, birthday);
    }

    public void add_worker(Worker w){
        workers.add(w);
        w.new_boss(this);
    }

    public void sub_worker(Worker w){
        workers.remove(w);
    }

   
    public Worker next(){
       // for(workersIndex = 0; workersIndex<workers.length; workersIndex++){
        	// casting to Worker
            Worker w = (Worker) workers.getPerson(wIndex);
            wIndex++;
            return w;
     //   }return null;
    }
    
    public void reset() {
    	wIndex = 0;
    }
    
    public void print(PrintStream ps) {
		ps.print(this.getName() + "\t");
		this.getBirthday().printDate(ps);
		ps.print("\tWorkers: ");

		for (int i = 0; i < workers.getSize(); i++) {
			if (workers.getListOfPeople()[i] != null) {
				ps.print(workers.getPerson(i).getName() + " ");
				}
			
			}
		
		}

}

