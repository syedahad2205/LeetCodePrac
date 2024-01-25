class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {

//        val arrSet = nums.toSet()
//        val numsRef = arrSet.toIntArray()
//        return !numsRef.contentEquals((nums))

        return (nums.size != nums.toSet().size)

    }
}