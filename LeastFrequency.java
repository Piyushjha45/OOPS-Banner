import java.util.HashMap;

public class LeastFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int minFreq = Integer.MAX_VALUE;
        int result = -1;

        // Find least frequency element
        for (int key : map.keySet()) {
            if (map.get(key) < minFreq) {
                minFreq = map.get(key);
                result = key;
            }
        }

        System.out.println("Element with least frequency: " + result);
        System.out.println("Frequency: " + minFreq);
    }
}
