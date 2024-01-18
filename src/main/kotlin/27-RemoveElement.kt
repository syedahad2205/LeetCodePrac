class RemoveElement {
    fun removeElement(nums: IntArray, ele: Int): Int {
        var index = 0
        for (num in nums) {
            if (ele != num) {
                nums[index++] = num
            }
        }
        return index
    }
}