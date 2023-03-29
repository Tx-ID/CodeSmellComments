public void calculateShapeArea(String shapeType, int side, int width) {
    // creates a new variable
    int area = 0;

    // check for shape types
    if (shapeType == "Square") {
        // square is side squared
        area = side * side;
    } else if (shapeType == "Rectangle") {
        // rectangle is width times height
        area = side * width;
    } else if (shapeType == "Circle") {
        // circle is pi times radius squared
        area = 3.14 * side * side;
    }

    // prints out the area for user
    System.out.println("Area of " + shapeType + " : " + area);
}

class Main {
    public static void main(String[] args) {
        // initializing variables
        int squareSide = 7;
        int rectangleWidth = 8;
        int rectangleHeight = 3;
        int circleRadius = 10;

        // getting areas
        calculateShapeArea("Square", squareSide, 0);
        calculateShapeArea("Rectangle", rectangleWidth, rectangleHeight);
        calculateShapeArea("Circle", circleRadius, 0);
    }
}