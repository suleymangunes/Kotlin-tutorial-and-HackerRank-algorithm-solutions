fun main(){
    print("adiniz: ")
    // disardan deger almak icin readline kullanilir
    // ancak disardan deger alinmama olasiligi da oludugundan !! ile kullaniciya guvenilir
    // soru isareti ile sadece string degil ayni zamanda null gelebilecegini de bildiri
    var isim:String? = readLine()!!
    print("soyadiniz: ")
    var soyIisim:String = readLine()!!
    println("isminiz $isim soyisminiz $soyIisim")

    print("bu kez sayi gir: ")
    // readline disardan string deger alir
    // bu yuzden disardan alinan degerin integer olarak kullanilmasi isteniyorsa donusum yapilmalidir
    // ancak disardan int gelme zorunlulugu olmadigindan int disinda deger gonderilirse hata gonderir
    // bu yuzden try excep kullanilabilir
    var sayi:Int? = readLine()!!.toInt()
    print(sayi)
}