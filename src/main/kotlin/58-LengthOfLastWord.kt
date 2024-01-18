class LengthOfLastWord {
    fun lengthOfLastWord(s: String): Int {
        val listOfWords = s.trim().split(" ")
        return listOfWords.last().length
//        return s.trim().takeLastWhile { it != ' ' }.length
    }
}