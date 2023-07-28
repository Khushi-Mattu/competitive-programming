class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder combination = new StringBuilder();
        backtrack(result, mapping, combination, digits, 0);
        return result;
    }

    private void backtrack(List<String> result, String[] mapping, StringBuilder combination, String digits, int index) {
        if (index == digits.length()) {
            result.add(combination.toString());
        } else {
            String letters = mapping[digits.charAt(index) - '0'];
            for (char letter : letters.toCharArray()) {
                combination.append(letter);
                backtrack(result, mapping, combination, digits, index + 1);
                combination.deleteCharAt(combination.length() - 1);
            }
        }
    }
}