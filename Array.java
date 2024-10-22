public class Array {
    public static void arrayToString(int[] values){
        System.out.print("[");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]);
            if (i != values.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
