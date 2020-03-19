public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {9,14,3,2,43,11,58,22};
        System.out.println("Before Selection Sort");
        for(int i:data){
            System.out.print(i+" ");
        }
        System.out.println();

        selectionSort(data);//sorting array using selection sort

        System.out.println("After Selection Sort");
        for(int i:data){
            System.out.print(i+" ");
        }
    }

    private static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < data.length; j++){
                if (data[j] < data[index]){
                    index = j;
                }
            }
            int smallerNumber = data[index];
            data[index] = data[i];
            data[i] = smallerNumber;
        }
    }

}


