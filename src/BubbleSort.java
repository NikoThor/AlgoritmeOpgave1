public class BubbleSort {
    public static void main(String[] args) {

        // Opretter en Array
        int[] data = new int[10];
        // generer random tal ind i arrayen mellem 1 og 30
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 30 + 1);
        }

        System.out.println("Datasættet er generet og ser sådan ud");
        for (int tal : data) {
            System.out.print(tal + " ");
        }

        System.out.println();
        bubbleSort(data);

        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

    }

    private static void bubbleSort(int[] data) {
        int n = data.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (data[j - 1] > data[j]) {
                    //swap elements
                    temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }

            }
        }

    }
}