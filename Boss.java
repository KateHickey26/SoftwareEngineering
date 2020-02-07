import java.util.Arrays;

public class Boss extends Person {
    Lop workers = new Lop(10);
    int workersIndex = 0;

    Boss(String name, Date birthday) {
        super(name, birthday);
    }

    public void add_worker(Worker w){
        workers.add(w);
        w.new_boss(this);
    }

    public void sub_worker(Worker w){
        workers.remove(w);
    }

    // this method needs fixing
//    public Worker next(){
//        for(int i = 0; i<workers.length; i++){
//            i = workersIndex;
//            Worker w = (Worker)workers.getPerson(workersIndex);
//            return w;
//        }return null;
//    }
    
    public void reset() {
    	workersIndex = 0;
    }

}

