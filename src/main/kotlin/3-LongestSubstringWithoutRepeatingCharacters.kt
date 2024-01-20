/**
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

class LongestSubstringWithoutRepeatingCharacters {
    fun lengthOfLongestSubstring(s: String): Int {
        var currentSubstring = ""
        var longestSubstringLength = 0

        for (index in s.indices) {
            val currentChar = s[index]

            if (!currentSubstring.contains(currentChar)) {
                currentSubstring += currentChar
                longestSubstringLength = maxOf(longestSubstringLength, currentSubstring.length)
            } else {
                // removing all the characters until the repeated characters
                val indexOfRepeat = currentSubstring.indexOf(currentChar)
                currentSubstring = currentSubstring.substring(indexOfRepeat + 1) + currentChar
            }
        }
        return longestSubstringLength
    }
}