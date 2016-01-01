/**
 * Created by Sai Krishna on 01-01-2016.
 */
public class GetValues {
    public static void main(String[] args) {
     MathOperations mathOperations = new MathOperationsImpl();
        float value;
        value = mathOperations.sum(mathOperations.NEW_NUMBER,mathOperations.OLD_NUMBER);
        System.out.println("The Sum value is: "+value);
        value = mathOperations.diff(mathOperations.NEW_NUMBER,mathOperations.OLD_NUMBER);
        System.out.println("The difference value is: "+value);
        value = mathOperations.mul(mathOperations.NEW_NUMBER,mathOperations.OLD_NUMBER);
        System.out.println("The product value is: "+value);
        value = mathOperations.div(mathOperations.NEW_NUMBER,mathOperations.OLD_NUMBER);
        System.out.println("The quotient value is: "+value);
        value = mathOperations.mod(mathOperations.NEW_NUMBER,mathOperations.OLD_NUMBER);
        System.out.println("The remainder value is: "+value);
    }
}
