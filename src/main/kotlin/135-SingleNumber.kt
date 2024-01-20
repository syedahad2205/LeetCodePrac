class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        return nums.reduce(Int::xor)
    }
}