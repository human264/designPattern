package Strategy;

public class LeastJob implements Scheduler{


    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToagent() {
        System.out.println("현재 상담업무가 없거나 상댐대기가 가장 작은 상담원에게 할당합니다.");
    }



}
