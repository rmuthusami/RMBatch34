package ClassesExample;

public class DriverClass {
    public static void main(String[] args) {
        Box squareBox = new Box();

        squareBox.depth = 5;
        squareBox.height = 5;
        squareBox.width = 5;

        Box rectangleBox = new Box();

        rectangleBox.depth = 3;
        rectangleBox.height = 4;
        rectangleBox.width = 6;

        System.out.println("Box Width " + squareBox.width);
        System.out.println("Box Height " + squareBox.height);
        System.out.println("Box Depth " + squareBox.depth);

        System.out.println("rectangle Width " + rectangleBox.width);
        System.out.println("rectangle Height " + rectangleBox.height);
        System.out.println("rectangle Depth " + rectangleBox.depth);

        /*squareBox = rectangleBox;

        System.out.println("After assigning Rectangle to Square");
        System.out.println("Box Width " + squareBox.width);
        System.out.println("Box Height " + squareBox.height);
        System.out.println("Box Depth " + squareBox.depth);*/

        rectangleBox.depth = squareBox.depth;
        System.out.println("Rectange Depth " + rectangleBox.depth);

    }
}
