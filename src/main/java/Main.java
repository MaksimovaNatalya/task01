//To calculate perimeter and square of a triangle having the size of its legs

public class Main {
    public static void main(String[] args) {
        Triangle myTriangle = new Triangle();
        myTriangle.setFirstLeg(3);
        myTriangle.setSecondLeg(4);
        System.out.println(TriangleAction.calculatePerimeter(myTriangle.getFirstLeg(), myTriangle.getSecondLeg()));
        System.out.println(TriangleAction.calculateSquare(myTriangle.getFirstLeg(), myTriangle.getSecondLeg()));
    }
}