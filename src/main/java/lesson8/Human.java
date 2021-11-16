package lesson8;

public class Human implements Participant{
    private String whoIs;
    private int canRun;
    private int canJump;

    public Human(int canRun, int canJump) {
        this.whoIs = "Человек";
        this.canRun = canRun;
        this.canJump = canJump;
    }

    public Human(){
    }

    public int getCanJump() {
        return canJump;
    }

    public int getCanRun() {
        return canRun;
    }

    public String getWhoIs() {
        return whoIs;
    }

    @Override
    public void jump() {
        System.out.println(whoIs + " прыгает.");
    }

    @Override
    public void run() {
        System.out.println(whoIs + " бежит.");
    }

}
