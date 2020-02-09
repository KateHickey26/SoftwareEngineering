import java.io.PrintStream;

public class Worker extends Person {
	Boss boss;

	// constructor
	public Worker(String name, Date birthday, Boss boss) {
		super(name, birthday);
		this.boss = boss;
	}

	// take a new boss and add workers to them
	public void new_boss(Boss b) {
		boss = b;
		b.add_worker(this);
	}
	
	public Boss getBoss() {
		return boss;
	} 
	
	//printstream for worker class
	public void print(PrintStream ps) {
		ps.print(this.getName()+"\t");
		this.getBirthday().printDate(ps);
		ps.print(" Boss: " + this.getBoss().getName()+"\n");
	}
}
