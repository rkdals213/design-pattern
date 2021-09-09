package strategy;

public interface Scheduler {
    void getNextCall();

    void sendCallToAgent();
}
