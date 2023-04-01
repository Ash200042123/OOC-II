import java.util.ArrayList;

abstract class Shapes {
    abstract ArrayList<String> Draw();

    public static ArrayList<String> arr = new ArrayList<String>();
}

    class Circle extends Shapes {
        Circle() {
            arr.add("drawing circle\n");
        }

        @Override
        ArrayList<String> Draw() {
            String s = "Drawing Circle";
            System.out.println(s);
            return arr;
        }
    }

class Square extends Shapes{

    Square(){
        arr.add("drawing square\n");
    }
    @Override
    ArrayList<String> Draw() {
        System.out.println("Drawing Square");
        return arr;
    }
}

class Rectangle extends Shapes{

    Rectangle(){
        arr.add("drawing rectangle\n");
    }

    @Override
    ArrayList<String> Draw() {
        System.out.println("Drawing Rectangle");
        return arr;
    }
}

