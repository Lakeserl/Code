import java.util.HashMap;

public class P1 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>(); // HashMap để lưu giá trị và chỉ số

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Tính phần bổ sung

            // Nếu phần bổ sung đã tồn tại trong HashMap, trả về chỉ số
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }

            // Lưu giá trị hiện tại vào HashMap với key là giá trị và value là chỉ số
            seen.put(nums[i], i);
        }

        return new int[] {}; // Trường hợp không tìm thấy
    }

    public static void main(String[] args) {
        // Test cases
        int[] result1 = twoSum(new int[] {2, 7, 11, 15}, 9);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]"); // Output: [0, 1]

        int[] result2 = twoSum(new int[] {3, 2, 4}, 6);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]"); // Output: [1, 2]

        int[] result3 = twoSum(new int[] {3, 3}, 6);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]"); // Output: [0, 1]
    }
}
