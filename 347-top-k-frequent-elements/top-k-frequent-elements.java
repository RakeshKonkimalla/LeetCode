class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        TreeSet<int[]> set = new TreeSet<>((a, b) -> {
            if (b[1] != a[1]) {
                return b[1] - a[1];
            }
            return Integer.compare(a[0], b[0]);
        });

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            set.add(new int[]{entry.getKey(), entry.getValue()});
        }

        int[] ans = new int[k];

        for (int[] pair : set) {
            ans[ans.length - k] = pair[0];
            k--;

            if (k == 0) {
                break;
            }
        }

        return ans;
    }
}
