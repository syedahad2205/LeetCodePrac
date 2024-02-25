//Example 1:
//
//Input: s = "tree"
//Output: "eert"
//Explanation: 'e' appears twice while 'r' and 't' both appear once.
//So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
//Example 2:
//
//Input: s = "cccaaa"
//Output: "aaaccc"
//Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
//Note that "cacaca" is incorrect, as the same characters must be together.
//Example 3:
//
//Input: s = "Aabb"
//Output: "bbAa"
//Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
//Note that 'A' and 'a' are treated as two different characters.

class SortCharactersByFrequency {
    fun frequencySort(s: String): String {
        val freqMap = mutableMapOf<Int, Int>()
        s.forEach { c ->
            val ascii = c.digitToInt()
            if (!freqMap.containsKey(ascii)) {
                freqMap[ascii] = 1
            } else {
                freqMap[ascii] = freqMap[ascii]!!.plus(1)
            }
        }
        val sortedFreqMap = freqMap.toList().sortedWith(compareBy { it.second })
        val letterList = sortedFreqMap.map {
            it.first.toChar()
        }
        return letterList.joinToString { "" }

    }
}

fun main() {
    val s = "tree"
    val freqMap = mutableMapOf<Int, Int>()
    s.forEach { c ->
        val ascii = c.toInt()
        if (!freqMap.containsKey(ascii)) {
            freqMap[ascii] = 1
        } else {
            freqMap[ascii] = freqMap[ascii]!!.plus(1)
        }
    }
    val sortedFreqMap = freqMap.toList().sortedWith(compareByDescending { it.second })
    println(sortedFreqMap)

    var final = ""
    sortedFreqMap.forEach {
        val count = it.second
        val letter = it.first.toChar()
        for (i in 0..<count){
            final+=(letter)
        }
    }
    println(final)
}