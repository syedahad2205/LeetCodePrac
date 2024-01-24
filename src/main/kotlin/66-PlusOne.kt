class PlusOne {
    fun plusOne(digits: IntArray) {
        println(incrementArray(digits, digits.size - 1))
    }

    private fun incrementArray(digits: IntArray, pointer: Int = digits.size - 1): IntArray {
        return if (digits[pointer] != 9) {
            digits[pointer] = digits[pointer] + 1
            digits
        } else {
            if (pointer != 0) {
                digits[pointer] = 0
                incrementArray(digits, pointer - 1)
            } else {
                digits[pointer] = 0
                intArrayOf(1) + digits
            }
        }
    }

}
