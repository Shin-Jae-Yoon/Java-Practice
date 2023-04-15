package chap08;

public class Exception03 {
    public static void main(String[] args) {
        int[] array = {4, 2};
        int[] value = null;

        try {
            value[0] = array[0] / array[1];
        } catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println(aiob.toString());
        } catch (ArithmeticException ae) {
            System.out.println(ae.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
