/**Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.*/

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()){
            return ""
        }
        strs.sort()
        //once sorted, only first and last string is enough to be compared.
        val first = strs[0]
        val last = strs[strs.size-1]

        val minLength = minOf(first.length,last.length)
        var i =0
        while ( i <minLength && first[i]==last[i]){
            i++
        }

       return first.substring(0,i)
    }
}

