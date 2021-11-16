package lesson8;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(15, 4);
        Human human = new Human(10, 2);
        Robot robot = new Robot(30, 5);

        Wall wall1 = new Wall(2);
        Wall wall2 = new Wall(3);
        Racetrack racetrack1 = new Racetrack(10);
        Racetrack racetrack2 = new Racetrack(20);

        Obstacle[] obstacles = {wall1, wall2, racetrack1, racetrack2};

        Participant[] participants = {cat, human, robot};

        System.out.println("Участники просто разминаются:");
        for (Participant participant : participants) {
            participant.run();
            participant.jump();
        }

        System.out.println();
        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle.prevent(participant)) {

                } else {
                    System.out.println(participant.getWhoIs() + " снят с соревнований...");
                    break;
                }
            }
            System.out.println();
        }

    }
}