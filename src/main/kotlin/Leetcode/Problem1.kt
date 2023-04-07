package Leetcode

fun main(args:Array<String>){
    val solutionOne = Solution()
    solutionOne.numRescueBoats(intArrayOf(2,2), 6)
    //solutionOne.numRescueBoats(intArrayOf(3, 2, 2,1), 3)

}
class Solution {
    fun numRescueBoats(people: IntArray, limit: Int): Int {
        var boat = 0
        var totalBoatWeight = 0
        var count = 0
        var balance = 0
        people.sort()

        var lastElement = people[people.lastIndex]
        var secondLastElement = people[people.lastIndex - 1]


        for(personWeight in people){
            println("Person weight: $personWeight")
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
                    } else if (totalBoatWeight < limit && lastElement == personWeight) {

                        if (lastElement == secondLastElement){
                            boat++
                        }


                        println(people.lastIndex)
                        println(people[people.lastIndex])

                    } else {
                        count ++
                        println("what")
                        continue
                    }

                }else {
                    count ++
                    boat += count
                    totalBoatWeight = 0
                    count = 0
                }
            }
        }


        return boat

    }
}

