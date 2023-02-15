package inheritanceCode

interface Roamable {
    fun roam()

    var roamName: String
        get() = "Roaming?"
        set(value){
            println("We don't roam here.")
        }
}