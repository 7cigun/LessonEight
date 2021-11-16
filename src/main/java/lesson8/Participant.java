package lesson8;

public interface Participant extends Runner, Jumper{
    int getCanJump();
    int getCanRun();
    String getWhoIs();
}
