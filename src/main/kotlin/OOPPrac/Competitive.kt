package OOPPrac

abstract class Proffessional(val name:String, val age: Int){
}

class androidDev(val devName:String, val devAge:Int, val techStack:String): Proffessional(devName, devAge){
    fun developProject(){

    }
}

class webDev(val devName:String, val devAge:Int, val techStack: String):Proffessional(devName, devAge){

    fun developProject(){

    }
}

class Hackathon{

    fun startProject(){

    }
    fun testApplicantProjects(moderatorComment: List<String>){
        val successRate = mapOf<String, String>(
            "Scalable" to "60 and above",
            "Concise" to "67 and above"
        )
        for (judgement in moderatorComment){
            if (judgement in successRate){
                println("You passed initial stage")
            }else{
                println("Try again next year")
            }
        }
    }
}

class Moderator{
    fun judgeProjects(project:Hackathon){

    }
}