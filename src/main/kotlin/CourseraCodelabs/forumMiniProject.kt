package CourseraCodelabs

fun main(args:Array<String>){
    //Step 5: filtering for blocked commentors
    for (comment in userComments){
        if (comment.userId !in blockedUsers){
            if (comment.userId in userIdToRelation){
                println("Comment ${comment.comment} is by ${userIdToRelation[comment.userId]}")
            }else{
                println("Comment ${comment.comment} by unknown")
            }
        }
    }

}

//Step 1: creating a comments class for all user comments
class Comment(val userId:Int, val comment:String)

//Step 2: collecting a list of comments
val userComments = listOf<Comment>(
    Comment(5241, "Nice code"),
    Comment(6624, "Like it"),
    Comment(5224, "What's going on?"),
    Comment(9001, "Check out my website"),
    Comment(8818, "Hello everyone :)")
)

//Step 3: defining a set of blocked users

val blockedUsers = setOf<Int>(5224, 9001)

//Step 4: defining user relationships to author
val userIdToRelation = mapOf<Int, String>(
    5241 to "Friend",
    6624 to "Co-worker"
)



