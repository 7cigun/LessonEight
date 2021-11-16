package lesson8;

public class Racetrack implements Obstacle {
    private int length;

    public Racetrack(int length) {
        this.length = length;
    }

    public Racetrack() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    @Override
    public boolean prevent(Participant participant) {
        if (length <= participant.getCanRun()) {
            System.out.println(participant.getWhoIs() + " пробежал расстояние длиной в " + length);
            return true;
        } else {
            System.out.println(participant.getWhoIs() + " не справился с расстоянием в " + length);
            return false;
        }
    }
}