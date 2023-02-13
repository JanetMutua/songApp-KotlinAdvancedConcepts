package practiceFiles
class Song (val title:String, val artist:String){

    fun playSong(){
        println("Playing $title by $artist")
    }

    fun stopSong(){
        println("Stopped playing $title")
    }
}


fun main(args:Array<String>){
    var songOne = Song("Lilac tree", "Kombato")
    var songTwo = Song("Loving me again", "The crossroads")
    var songThree = Song("Who run the worlds", "Sia")

    songOne.playSong()
    songOne.stopSong()
    songThree.playSong()
}