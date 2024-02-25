//Wrong

class LargestDivisibleSubset {
    fun largestDivisibleSubset(nums: IntArray): List<Int> {
        var largestSubset = emptyList<Int>()
        nums.sort()
        for (i in 0..<nums.size) {
            for (j in 0..nums.size - 2) {
                val tempList = emptyList<Int>()
                if (i < nums.size - 1) {
                    if (nums[i] % nums[i + 1] == 0) {
                        if (!largestSubset.contains(nums[i])) {
                            tempList.plus(nums[i])
                        }
                        tempList.plus(nums[i + 1])
                    }
                    if (tempList.size > largestSubset.size) {
                        largestSubset = tempList
                    }
                }
            }

        }
        return largestSubset
    }
}

fun main() {
    val nums = intArrayOf(1, 2, 4, 8)
    var largestSubset = emptyList<Int>()
    var tempList = emptyList<Int>()
    nums.sort()
    for (i in nums.indices) {
        tempList = emptyList<Int>()
        for (j in 0..nums.size - 2) {


            if (i < nums.size - 1) {

                if (nums[j + 1] % nums[j] == 0) {

                    if (!tempList.contains(nums[j])) {
                        tempList = tempList.plus(nums[j])
                    }
                    tempList = tempList.plus(nums[j + 1])
                }
            }

        }
        println("$tempList *****")
        if (tempList.size > largestSubset.size) {
            largestSubset = tempList
        }

    }

    println(largestSubset)
}

////chatgpt
//fun answer(nums: IntArray) {
//// Step 1: Sort the input list
//    nums.sort()
//
//// Step 2: Initialize arrays dp and prev
//    val n = nums.size
//    val dp = IntArray(n) { 1 } // dp[i] stores the length of the largest divisible subset ending at index i
//    val prev = IntArray(n) { -1 } // prev[i] stores the index of the previous number in the largest divisible subset
//
//// Step 3: Iterate through each index i of nums
//    for (i in nums.indices) {
//        // Step 4: Iterate through each index j from 0 to i-1
//        for (j in 0 until i) {
//            // Check if nums[i] is divisible by nums[j]
//            if (nums[i] % nums[j] == 0) {
//                // Update dp[i] and prev[i] if dp[j] + 1 is greater than dp[i]
//                if (dp[j] + 1 > dp[i]) {
//                    dp[i] = dp[j] + 1
//                    prev[i] = j
//                }
//            }
//        }
//    }
//
//// Step 5: Find the index of the maximum value in dp
//    var maxIndex = 0
//    for (i in 1 until n) {
//        if (dp[i] > dp[maxIndex]) {
//            maxIndex = i
//        }
//    }
//
//// Step 6: Reconstruct the largest divisible subset starting from maxIndex
//    val subset = mutableListOf<Int>()
//    var currIndex = maxIndex
//    while (currIndex != -1) {
//        subset.add(nums[currIndex])
//        currIndex = prev[currIndex]
//    }
//
//// Step 7: Return the largest divisible subset
//    return subset.reversed()
//}