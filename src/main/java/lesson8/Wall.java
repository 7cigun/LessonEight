package lesson8;

public class Wall implements Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public Wall (){}

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean prevent(Participant participant) {
        if (height <= participant.getCanJump()) {
            System.out.println(participant.getWhoIs() + " перепрыгнул препятствие высотой в " + height);
            return true;
        } else {
            System.out.println(participant.getWhoIs() + " не справился с высотой в " + height);
            return false;
        }
    }
}
