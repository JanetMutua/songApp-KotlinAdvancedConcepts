package Leetcode

fun main(args:Array<String>){
    val solutionOne = Solution()
    val solutionTwo = Solution()
    //solutionOne.numRescueBoats(intArrayOf(2,2), 6)
    //solutionTwo.numRescueBoats(intArrayOf(3, 2, 2,1), 3)
    solutionTwo.numRescueBoats(intArrayOf(3, 1, 7), 7)

}
class Solution {
    fun numRescueBoats(people: IntArray, limit: Int){
        var boat = 0
        var totalBoatWeight = 0
        var count = 0
        var balance = 0
        var loopCount = 0
        people.sort()

        var lengthOfArray = people.size


        for(personWeight in people){
            loopCount ++
            println("we are in $personWeight weight")
            if(personWeight <= limit && totalBoatWeight <= limit){
                balance = limit - totalBoatWeight
                if(balance == 0){
                    boat += count
                    totalBoatWeight = 0
                    count = 0
                }else if (balance <= limit && personWeight <= balance){
                    totalBoatWeight += personWeight
                    if (totalBoatWeight == limit){
                        boat ++
                    } else if (totalBoatWeight < limit && loopCount == lengthOfArray) {
                        println("We have looped $loopCount times")

                            boat++
                    } else if (totalBoatWeight < limit){
                        count ++
                        println("My total count is $count")
                        continue
                    } else {
                        if (count != 0){
                            count ++
                            boat += count
                        } else{
                            println("what")
                            boat ++
                        }


                    }

                }else {
                    totalBoatWeight += personWeight
                    println("Total Weight: $totalBoatWeight")
                    if (count != 0 && totalBoatWeight > limit){
                        boat += count
                        totalBoatWeight = 0
                        count = 0
                    }else{
                        boat++
                    }

                }
            }
        }


        println("No of boats: $boat")

    }
}

