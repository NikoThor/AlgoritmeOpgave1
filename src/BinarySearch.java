public class BinarySearch {
    public static void main(String[] args) {
        int data[] = {10, 20, 30, 40, 50};
        int key = 40;
        int last = data.length - 1;
        binarySearch(data, 0, last, key);
    }

    private static void binarySearch(int[] data, int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (data[mid] < key) {
                first = mid + 1; } else if (data[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break; } else { last = mid - 1;}
            mid = (first + last) / 2;
        }
        if (first > last) { System.out.println("Element is not found!"); }
    }
}

