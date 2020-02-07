
public class Boss extends Person {

	// constructor
	Boss(String name, Date birthday) {
		super(name, birthday);
	}

	public void add_worker(Worker) {
		workers.add(w);
		w.new_boss(this);
	}
	
	public void sub_worker(Worker) {
		workers.remove(w);
	}
	
	public Worker next() {
		Worker worker = Worker workers.getPerson(workerIndex);
	}
	
}

