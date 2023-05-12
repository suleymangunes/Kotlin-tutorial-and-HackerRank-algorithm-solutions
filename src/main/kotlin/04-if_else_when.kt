fun main(){
    // disardan deger alindi ve tanimlanan degere atandi
    var yas:Int
    print("yasinizi girin: ")
    // disarda
    yas = readLine()!!.toInt()

    // if kosul yapisi olusturuldu
    // kotlin dilinde kosul sonucu degiskene atanabilir
    // tanimlanacak degisken turu belirtilmedigi surece her turden geri donus saglanabilir
    var sonuc:String = if(yas <= 18 && yas > 0){
        println("oy kullanmazsin")
        "oy kullanamaz"
    } else if(yas > 18){
        println("oy kullanabilirsin")
        "oy kullanabilir"
    } else if(yas == 0){
        println("henuz dogmadin")
        "oy kullanamaz"
    } else {
        println("gecmiste yasayamazsin")
        "oy kullanamaz"
    }
    // sonuc ciktisi
    println(sonuc)

    // disadedan deger alindi
    print("ne istersiniz efendim: ")
    var cikti = readlnOrNull()
    // degere gore when ile deger icerigi ne ise uygun kosul olusturuldu
    // kotline ozel olan bu yapi ayni zamanda sonuc degiskeni de alabilir
    // ayni zamanda tek degisken turu uzerinden degil farkli degiskenlerin de karsilastirilmasini saglar
    var ciktiSonucu = when(cikti){
        "selam ver" -> {
            println("merhabalar")
            "selam verildi"
        }
        null -> {
            println("gorusuruz")
            "ayrildi"
        }
        "kendini tanit" -> {
            println("merhaba ben suleyman")
            "kendi tanitildi"
        }
        else -> {
            println("bu kadarini da bilmiyorum")
            "cevap bulunamadi"
        }
    }
    println(ciktiSonucu)
}