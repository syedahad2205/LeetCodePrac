class GroupAnagrams {
    //    Input: strs = ["eat","tea","tan","ate","nat","bat"]
//    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val anagramMap = mutableMapOf<String,MutableList<String>>()
        strs.forEach { word ->

            val sorted = word.toCharArray().sorted().joinToString ("" )
            if (anagramMap.containsKey(sorted).not()){
                anagramMap[sorted] = mutableListOf()
            }
            anagramMap[sorted]?.add(word)
        }
        val x = ArrayList(anagramMap.values)
        return x
    }
}