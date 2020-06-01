import java.util.*;
import java.util.stream.IntStream;

class A {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(sort(line));
        }

    }

    private static String sort(String line) {
        int[] letters = new int[128];
        for (char c : line.toCharArray()) {
            letters[c]++;
        }
        PriorityQueue<Character> heap = new PriorityQueue<>(128, (a, b) -> Integer.compare(letters[b], letters[a]));
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < letters.length; ++i) {
            if (letters[i] != 0) heap.offer((char)i);
        }

        while (!heap.isEmpty()) {
            char c = heap.poll();
            while (letters[c]-- > 0)
                res.append(c);
        }
        return res.toString();

    }

}
