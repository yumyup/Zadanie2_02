/**
 * Created by Helmut on 2017-03-07.
 */
public class CalcTest {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();


        double sBox = shapeCalculator.squareBox(3.2);
        double scirc = shapeCalculator.areaOfaCircle(6.6);
        double cTria = shapeCalculator.circutTriangle(1, 2, 6.9);
        double cRec = shapeCalculator.circutRectangle(3.2, 6.1);

        System.out.println("pole kwadratu: " + sBox);
        System.out.println("pole koła: " + scirc);
        System.out.println("obwód trójkąta: " + cTria);
        System.out.println("pole kwadratu: " + cRec);
    }

}
