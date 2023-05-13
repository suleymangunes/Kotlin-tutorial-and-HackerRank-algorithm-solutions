// fun on eki ile fonksiyon tanimlanir
// parameter olarak verilen degerlerin turu belirtilmelidir
// geri donuc degeri paramterler tanimlandiktan sonra belirtilir
fun sum( ilkSayi:Int, ikinciSayi:Int):Int{
    // fonksiyon icinde tanimlanan deger local degisken olarak tanimlanir ve suslu paranter disinda kullanilmaz
    val result = ilkSayi + ikinciSayi
    // bir fonksiyon icinde baska fonksiyon da cagrilabilir
    readdir(result)
    return result
}

// geri donus tipi olmazsa bir sey belirtmeye gerek yoktur
fun readdir(result:Int){
    println(result)
}

// global degisken tanimlandi
val globalDegisken:Int = 5

fun main(){
    sum(globalDegisken, 6)

    // overloading
    // ayni isimli fonksiyonlarin farkli isler yapmasidir
    fun add(value:Int):Int{
        return value + value
    }

    fun add(value:String):String{
        return value + value
    }
    // ayni isimdeki fonskyionlar farkli islverler yaparak overloading yapmis oldu
    println(add(5))
    println(add("bes"))

    // extension
    // extension ile istenen yapilara ozellikler kazandirilir
    // ornekte stringe ozellik kazandirilarak bosluk yerine _ getirilmesi saglanmistir
    fun String.bosluklariDegistir():String {
        var sonuc:String = ""
        for (i in this.split(" ")){
            sonuc = sonuc + i + "_"
        }
        return sonuc
    }

    var degerim:String = "Merhaba benim adim suleyman"
    println(degerim.bosluklariDegistir())

    // infix
    // infix ile istenene yapilara ozellikler kazandirilabilir
    // ornekte disardan gelen sayi ile istenen sayinin toplanmasi saglanmistir
    infix fun Int.addNum(sayi:Int):Int=this + sayi

    print(6 addNum 4)

}