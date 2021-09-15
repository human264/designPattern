package Strategy;

public class SchedulerTest {

    public static void main(String[] args) throws Exception{

        System.out.println("전화 상담 선택");
        System.out.println("R");
        System.out.println("L");
        System.out.println("P");

        Scheduler scheduler = null;

        int ch = System.in.read();

        if(ch == 'r' || ch == 'R') {
            scheduler = new RoundRobin();
        } else if(( ch == 'p') || (ch == 'P')) {
            scheduler = new PriorityAllocation();
        }   else if(( ch == 'l') || (ch == 'L')) {
            scheduler = new LeastJob();
        }

        else {
            System.out.println("not supported");
            return;

        }
            scheduler.getNextCall();
            scheduler.sendCallToagent();



    }



}
