class SearchInsertPosition {
        fun searchInsert(nums: IntArray, target: Int): Int {
            val mid = nums[nums.size/2]
            val midIndex = nums.size/2
            var index = 0
            if(target==mid){
                return midIndex
            }
            if (target>mid){
                index = midIndex
                while (index < nums.size - 1){
                    if (target > nums[index] && target < nums[index + 1]) {
                        return index + 1
                    }
                    index++
                }
            }
            else {
                index = 0
                while (index < midIndex){
                    if (target > nums[index] && target < nums[index + 1]) {
                        return index + 1
                    }
                    index++
                }
            }
            return -1
        }
}