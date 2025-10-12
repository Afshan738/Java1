public class DIY19 {
    public static void main(String[] args) {
        // now i will create teh object of the class ...
        DIY19 myCalculator = new DIY19();
        int getSquareArea = myCalculator.areaCal(5);
        System.out.println("The area of square is " + getSquareArea);
        int rectangleOneArea = myCalculator.areaCal(12, 34);
        System.out.println("The area of rectangleOne is " + rectangleOneArea);
        float rectangleTwoArea = myCalculator.areaCal(12.4f, 19.6f);
        System.out.println("The area of rectangleTwo is " + rectangleTwoArea);

    }

    public int areaCal(int side) {
        int squareArea = side * side;
        return squareArea;
    }

    public int areaCal(int length, int width) {
        int rectangleArea1 = length * width;
        return rectangleArea1;
    }

    public float areaCal(float length, float width) {
        float rectangleArea2 = length * width;
        return rectangleArea2;
    }
}
