package lesson8;

public class Cat implements Participant{
    private String whoIs;
    private int canRun;
    private int canJump;

    public Cat(int canRun, int canJump) {
        this.whoIs = "Кот";
        this.canRun = canRun;
        this.canJump = canJump;
    }

    public Cat(){
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
