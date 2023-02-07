class Solution {
    public int totalFruit(int[] fruits) {
        // Hash map 'basket' to store the types of fruits.
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0, right;
        
        // Add fruit from right side (right) of the window.
        for (right = 0; right < fruits.length; ++right) {
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);
            
            // If the current window has more than 2 types of fruit,
            // we remove one fruit from the left index (left) of the window.
            if (basket.size() > 2) {
                basket.put(fruits[left], basket.get(fruits[left]) - 1);
                if (basket.get(fruits[left]) == 0)
                    basket.remove(fruits[left]);
                left++;
            }
        }
        
        // Once we finish the iteration, the indexes left and right 
        // stands for the longest valid subarray we encountered.
        return right - left;
    }
}
/*

Optimised Brute force
class Solution {
    public int totalFruit(int[] fruits) {
        // Maximum number of fruits we can pick
        int maxPicked = 0;
        
        // Iterate over the left index left of subarrays.
        for (int left = 0; left < fruits.length; ++left) {
            // Empty set to count the type of fruits.
            Set<Integer> basket = new HashSet<>();
            int right = left;
            
            // Iterate over the right index right of subarrays.
            while (right < fruits.length) {
                // Early stop. If adding this fruit makes 3 types of fruit,
                // we should stop the inner loop.
                if (!basket.contains(fruits[right]) && basket.size() == 2)
                    break;
                
                // Otherwise, update the number of this fruit.
                basket.add(fruits[right]);
                right++;
            }
            
            // Update maxPicked.
            maxPicked = Math.max(maxPicked, right - left);
        }
        
        // Return maxPicked as the maximum length of valid subarray.
        // (maximum number of fruits we can pick).
        return maxPicked;
    }
}

Brute Force
class Solution {
    public int totalFruit(int[] fruits) {
        // Maximum number of fruits we can pick
        int maxPicked = 0;
        
        // Iterate over all subarrays (left, right)
        for (int left = 0; left < fruits.length; ++left) {
            for (int right = 0; right < fruits.length; ++right) {
                // Use a set to count the type of fruits.
                Set<Integer> basket = new HashSet<>();
                
                // Iterate over the current subarray.
                for (int currentIndex = left; currentIndex <= right; ++currentIndex) {
                    basket.add(fruits[currentIndex]);
                }
                
                // If the number of types of fruits in this subarray (types of fruits) 
                // is no larger than 2, this is a valid subarray, update 'maxPicked'.
                if (basket.size() <= 2) {
                    maxPicked = Math.max(maxPicked, right - left + 1);
                }
            }
        }
        
        // Return 'maxPicked' as the maximum length (maximum number of fruits we can pick).
        return maxPicked;
    }
}