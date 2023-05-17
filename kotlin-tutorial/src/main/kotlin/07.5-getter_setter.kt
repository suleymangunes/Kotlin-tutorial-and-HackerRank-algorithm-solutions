class GetSetClass(name:String, sur:String){
    var name:String?=null
        // get set tanimlandi
        // get ile veri cekilri
        // set ile deger guncellenir
        // disardan erisim kistilanir encapsutalion yapilir
        get() = field
        set(value) {
            field = value
        }

    var sur:String?=null
        get() = field
        set(value) {
            field = value
        }

    override fun toString(): String {
        return "name: $name\n" +
                "surname: $sur"
    }

}

fun main() {
    var getSetClass:GetSetClass = GetSetClass("suleyman", "gunes")
    getSetClass.name = "wong"
    getSetClass.sur = "kar wai"
    println(getSetClass)
}