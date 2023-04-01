import java.util.Scanner;

enum Position {
    North("North"),
    South("South"),
    East("East"),
    West("West");

    public String current_dir;
    public String to_go;

    Position(String x) {
        this.current_dir = x;

        switch (x) {
            case "North":
                this.to_go = "go South";
                break;
            case "South":
                this.to_go = "go North";
                break;
            case "East":
                this.to_go = "go West";
                break;
            case "West":
                this.to_go = "go East";
                break;
            default:
                this.to_go = "Unknown";
                break;
        }
    }
    String GetCurrentPosition(){
        return this.current_dir;
    }
    String GetNextMove() {
        return this.to_go;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String y = in.next();

        Position pos= Position.valueOf(y);
        System.out.println("I am in the "+pos.GetCurrentPosition());
        System.out.println("I have to "+pos.GetNextMove());
    }
}