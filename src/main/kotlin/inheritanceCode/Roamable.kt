package inheritanceCode

interface Roamable {
    fun roam()

    var roamName: String
        get() = "Roaming?"
        //can't use the field keyword in properties in an interface
        //since an interface has no backing fields for properties(holds no reference)
        set(value){
            println("We don't roam here.")
        }
}