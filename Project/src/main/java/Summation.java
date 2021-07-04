public class Summation {

    public int sum(int a, int b) {

        int result = a + b;
        System.out.println(String.format("Sum of %d and %d is %d", a, b, result));

        return result;
    }

    // This should fail
    public int sum(float a, float b) {
        return (int)(a-b);
    }
}
