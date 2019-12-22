import java.util.Scanner;

public class Brick {
    public static void main(String[] args) {

        System.out.println("Insert number of bricks:");
        Scanner in = new Scanner(System.in);
        int bricks = in.nextInt();
        String currentPerson = "Patlu";
        int step = 1;
        int firstBrick = 1;
        int bricksMoved = 0;

        while ((bricks  - bricksMoved) > 0) {
            if ((step % 2) != 0) {
                currentPerson = "Patlu";
                bricksMoved = bricksMoved + firstBrick;
            } else {
                currentPerson = "Motu";
                bricksMoved = bricksMoved + (firstBrick * 2);
                firstBrick = firstBrick+ 1;
            }
            step = step + 1;
        }

        System.out.println(currentPerson);
    }
}

