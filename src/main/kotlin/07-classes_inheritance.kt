open class Artist(name:String, age:Int){
    var name:String
    var age:Int

    init {
        this.name = name
        this.age = age
    }

    open override fun toString(): String {
        return "name: $name\n" +
                "age: $age\n"
    }
}

class Actor(name:String, age:Int, movie:String):Artist(name, age){
    var movie:String

    init {
        this.movie = movie
    }

    override fun toString(): String {
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