import java.util.Scanner;

public class Question4 {

    static void analyzeInventory(int[] sectionA, int[] sectionB) {

        int totalA = 0;
        int totalB = 0;

        // Calculate total of Section A
        for (int i = 0; i < sectionA.length; i++) {
            totalA = totalA + sectionA[i];
        }

        // Calculate total of Section B
        for (int i = 0; i < sectionB.length; i++) {
            totalB = totalB + sectionB[i];
        }

        // Compare totals
        if (totalA == totalB) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

        // Find highest quantity
        int highest = sectionA[0];
        String section = "Section A";
        int index = 0;

        // Check Section A
        for (int i = 0; i < sectionA.length; i++) {
            if (sectionA[i] > highest) {
                highest = sectionA[i];
                section = "Section A";
                index = i;
            }
        }

        // Check Section B
        for (int i = 0; i < sectionB.length; i++) {
            if (sectionB[i] > highest) {
                highest = sectionB[i];
                section = "Section B";
                index = i;
            }
        }

        System.out.println("Highest quantity: " + highest);
        System.out.println("Found in: " + section);
        System.out.println("Index: " + index);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int n = sc.nextInt();

        int[] sectionA = new int[n];
        int[] sectionB = new int[n];

        System.out.println("Enter quantities for Section A:");

        for (int i = 0; i < n; i++) {
            sectionA[i] = sc.nextInt();
        }

        System.out.println("Enter quantities for Section B:");

        for (int i = 0; i < n; i++) {
            sectionB[i] = sc.nextInt();
        }

        analyzeInventory(sectionA, sectionB);

        sc.close();
    }
}