fun main(){

    // Aritmetik operatorler
    var a:Int = 2
    var b:Int = 1
    var z:Int

    // toplama
    z = a + b
    // cikarma
    z = a - b
    // carpma
    z = a * b
    // bolme
    z = a / b
    // mod
    z = a % b
    // bolumunden kalan
    z = a // b

    // Karsilastirma operatorleri
    // < kucuktur > buyuktu <= kucuk esit >= buyuk esit
    // == esit midir != esit degil midir
    // karsilatirma sonucu boolean degerler doner
    println(a > b)

    // mantiksal operatorler
    // ! degil
    // && ve
    // || veya
    println( 10 >9 && 10 == 10 || 10 < 5)

    // artirma ve azaltma
    // x+=y || x = x + y carpim bolum cikarma mod ayni sekilde
    // ++x once ekler  x++ sonra ekler diger islemler de ayni sekilde
    // once yazar sonra ekler
    println(a++)

    // range
    // sayi..sayi ile istenen iki sayi arasinda yapi olusturulabilir
    // char.rangeTo(char) ile iki karaketer arasinda alfaebtik sirali yapi olusturulabilri
    // .step ile atlama yapilabilir
    var besOnAraligi = 5..10
    println(6 in besOnAraligi)
    var yeniAralik = besOnAraligi.step(3)
    println(6 in yeniAralik)

    // islem onceligi
    // ()
    // ++ -- vs degiskenden once
    // ^
    // x /
    // + -
    // =
    // ++ -- degiskenden sonra
    // &&
    // ||
    // ,

}