import java.util.Scanner;

public class LinearSearch {
        public static void main(String args[])
        {
            int c, n, search, data[];

            Scanner in = new Scanner(System.in);
            System.out.println("Enter the amount of numbers");
            n = in.nextInt();
            data = new int[n];

            System.out.println("Enter those " + n + " numbers ");

            for (c = 0; c < n; c++)
                data[c] = in.nextInt();

            System.out.println("Enter value to find");
            search = in.nextInt();

            for (c = 0; c < n; c++)
            {
                if (data[c] == search)
                {
                    System.out.println(search + " is present at location " + (c + 1) + ".");
                    break;
                }
            }
            if (c == n)  /* Element to search isn't present */
                System.out.println(search + " isn't present in data.");
        }
    }