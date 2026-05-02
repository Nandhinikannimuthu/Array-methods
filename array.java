import java.util.ArrayList;
import java.util.Arrays;
class array {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = new int[a.length];

        b = a.clone();

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}

class array2 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = new int[a.length];

        System.arraycopy(a, 0, b, 0, a.length);

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}

class ArrayCopyOf {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6};

        int[] copy = Arrays.copyOf(a, a.length);

        System.out.println("Copied using Arrays.copyOf():");
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}

class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.set(1, 9); // replace 6 with 9
        arr.remove(Integer.valueOf(6)); // remove value 6 (if present)
        System.out.println(arr);
    }
}