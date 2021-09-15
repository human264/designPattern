package Strategy;

public class AgentGetCall implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 agent가 가져옵니다.");
    }

    @Override
    public void sendCallToagent() {
        System.out.println("Agent에게 할당합니다.");
    }
}
