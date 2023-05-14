// interface ile siniflarin zorunlu kullanmasi gereken ortak ozellikler saglanir
// interface can do iliskisi abstrack class ise is a iliskisi saglar
// interface icerisinde tanimlanan fieldlarin ve fonksiyonlarin icerigi doldurulamaz
interface SoyutSinif{
    var name:String
    var surName:String
    var yas:Int
    fun goster():String
}

// olusturulan interface : ile implemente edilir
class AnaSinif() :SoyutSinif{
    // override ile interfacein tum ozellikleri kullanilmalidir
    override var name:String = "suleyman"
    override var surName:String = "gunes"
    override var yas:Int = 21
    override fun goster():String {
        return "name: $name\n" +
                "surName: $surName\n" +
                "age: $yas"
    }
}

fun main() {
    var anaSinif:AnaSinif = AnaSinif()
    println(anaSinif.goster())
}