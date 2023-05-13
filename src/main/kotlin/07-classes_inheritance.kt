// kalitim yapilacak sinifin open ile kalitima izin vermesi gerekir
open class Artist(name:String, age:Int){
    var name:String
    var age:Int

    init {
        this.name = name
        this.age = age
    }

    override fun toString(): String {
        return "name: $name\n" +
                "age: $age\n"
    }
}

// kalitim yapmak icin : ile kalitim yapilacak sinif yazilir
// eger kalitim yapilan sinifin constructorda parametre varsa bu kisimda da kalitim sinifina yazilmali
// ayrica subclass constructoru icerisinde de bu degerler tanimlanmalidir
// tabi bu degerler superclass fieldı olarakta tanimliysa
class Actor(name:String, age:Int, movie:String):Artist(name, age){
    var movie:String

    init {
        this.movie = movie
    }

    override fun toString(): String {
        // super ile ust sinifin degerlerine ulasilir
        return super.toString() +
                "movie: $movie\n"
    }
}

fun main(){
    var artist:Artist = Artist("daniel day lewis", 50)
    println(artist)
    var actor:Actor = Actor("daniel", 50, "there will be blood")
    println(actor)
}