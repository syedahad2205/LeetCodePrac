class MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        var count  = 0
        var majorityElement = nums[0]

        for(num in nums){
            if (count == 0){
                majorityElement = num
            }
            if (num == majorityElement){
                count++
            } else {
                count --
            }
        }
        return majorityElement
    }
}