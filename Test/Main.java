@SuppressWarnings("ALL")

public class Main {
    public static void main(String[] args) {
        
        String carDirection = "Up";

        /* if (carDirection.equals("Left")) {
            System.out.println("Turn left!");
        } else if (carDirection.equals("Right")) {
            System.out.println("Turn right!");
        } else {
            System.out.println("Drive straight!");
        } */

        switch (carDirection) {
            case "Left":
                System.out.println("Turn left!");
                break;
            case "Right":
                System.out.println("Turn right!");
                break;
            default:
                System.out.println("Drive Straight!");
                break;
        }

    }
}

/* This is just to test out different control flow statements or to practice the basics. ignore. */