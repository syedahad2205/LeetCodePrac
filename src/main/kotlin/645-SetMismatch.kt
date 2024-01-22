class SetMismatch {
    fun findErrorNums(nums: IntArray): IntArray {
        var dup = 0
        val boolArray = BooleanArray(nums.size + 1)

        for (num in nums) {
            if (boolArray[num]) {
                dup = num
            } else {
                boolArray[num] = true
            }
        }
        val missing = boolArray.indexOfLast{ !it }

        return intArrayOf(dup, missing)
    }
}