import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] values = new int[10];

        Array.arrayToString(values);
        
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter the index (0-9) where you want to insert a value:");
        int number = input.nextInt();
        System.out.println("Enter the value to insert:");
        int value = input.nextInt();

        if (number < 0 || number >= values.length) {
            System.out.println("Error: Index out of range. Please enter a valid index between 0 and 9.");
        } else {
            values[number] = value;
            System.out.println("Updated array:");
            Array.arrayToString(values);
        }

        input.close(); 
    }

}
