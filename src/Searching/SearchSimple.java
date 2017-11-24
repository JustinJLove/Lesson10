package Searching;

public class SearchSimple {

    static int attempts;

    public static void main(String[] args) {
        String names[] = {"Cindy", "Fred", "Nancy", "Steve", "Tom", "Victor", "Yolanda"};
        //Search for Steve
        String name = "Bob";
        int loc = search(names, name);

        System.out.println(name + " is found at " + loc + " it took " + attempts + " attempt(s).");

    }

    public static int search(Object[] a, Object searchValue) {
        int left = 0;
        int right = a.length - 1;
        attempts = 0;
        while (left <= right) {
            attempts++;
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a[midpoint]).compareTo(searchValue);
            if (result == 0) {
                return midpoint;
            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;

    }
}
