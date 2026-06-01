package TestPad;

public class QuestionBank7 {

//    OOPs questions are skipped

    // Subarray with sum target - array may contain duplicate
    void printSubarrayWithSumK(){
        Map<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {

            prefixSum += arr[i];

            // Subarray starts from index 0
            if (prefixSum == target) {
                System.out.println("0 and " + i);
                return;
            }

            if (map.containsKey(prefixSum - target)) {
                int start = map.get(prefixSum - target) + 1;
                System.out.println(start + " and " + i);
                return;
            }

            map.put(prefixSum, i);
        }

        System.out.println("-1");
    }

    // Least Favourite Number
    void findLeastFavNumber(){
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int minFreq = Integer.MAX_VALUE;

        for (int count : freq.values()) {
            minFreq = Math.min(minFreq, count);
        }

        int ans = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == minFreq) {
                ans = Math.max(ans, entry.getKey());
            }
        }

        return ans;
    }


}
