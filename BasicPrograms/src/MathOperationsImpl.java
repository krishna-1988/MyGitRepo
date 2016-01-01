/**
 * Created by Sai Krishna on 01-01-2016.
 */
public class MathOperationsImpl implements MathOperations {
    float value;

    @Override
    public float sum(float firstNumber, float secondNumber) {
        value = firstNumber + secondNumber;
        return value;
    }

    @Override
    public float diff(float firstNumber, float secondNumber) {
        value = firstNumber - secondNumber;
        return value;
    }

    @Override
    public float mul(float firstNumber, float secondNumber) {
        value = firstNumber * secondNumber;
        return value;
    }

    @Override
    public float div(float firstNumber, float secondNumber) {
        value = firstNumber / secondNumber;
        return value;
    }

    @Override
    public float mod(float firstNumber, float secondNumber) {
        value = firstNumber % secondNumber;
        return value;
    }
}
