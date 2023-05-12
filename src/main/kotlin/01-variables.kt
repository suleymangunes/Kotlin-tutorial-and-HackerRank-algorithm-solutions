fun main(){

    // Degisken Tanimlama
    // degisebilen mutable degerler icin var ile tanimlama yapilir
    var myValue = 10
    myValue = 20
    println(myValue)

    // degisemeyen imutable degerler icin val ile tanimma yapilir
    val myImutableVal = 10
    // myImutableVal = 20 - error
    println(myImutableVal)

    // Degisken Turleri
    // degisken turu degisken ismi tanimlandiktan sonra tanimlanir
    var myNumber:Int = 30
    var myLong:Long = 16
    var myShort:Short = 13
    var myByte:Byte = 120
    var myDouble:Double = 1.2
    var myFloat:Float = 1.2f
    var myChar:Char = 'A'
    var myCharUnicode:Char = '\u0041'
    var myBoolean:Boolean = false

    // Degisken Turu Donusumleri
    // degisken turunu degistirmek icin toint tolong tofloat gibi metotlar kullanilir
    // ancak longdan byte donusturme gibi durumlardan veri kaybi yasanmasina dikkat edilmeldir
    var convertInt:Int = myLong.toInt()
    println(convertInt)

    // String metotlari
    // isempty bos mu
    // tolowercase kucuk harf uppercase buyuk harf
    // equals esit mi
    // trim bosluklari siler
    // plus string ekleme
    // length karakter uzunlugu
    





}