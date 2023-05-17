fun main() {

    // icerisinde 10 tane eleman olan ve her biri 0 degerinde int olan array olusturuldu
    // generic olarak int belirtildi bu sayede bu array sadede int alacaktir
    // array icerigi degistirileblir ancak icerigine eleman eklenemez
    var myArray:Array<Int> = Array<Int>(10){0}

    // [] ile istenen elemana ulasilabilir
    // ayrica icerigi degistirileblir
    myArray[0] = 5

    // istenen indexe gore degistirme islemi set ile de yapilabilir
    myArray.set(0, 6)


    // dongu icerisinde dolasarak deger ekrana yansitildi
    for (i in myArray){
        println("list item: $i")
    }

    // ici bos bir sekilde array olusturuldu
    // array liste elemen eklenebilir, kaldirilabilir ve icerik guncellenebilri
    var myArrayList = ArrayList<Int>()
    // ekleme
    myArrayList.add(5)
    myArrayList.add(9)
    myArrayList.add(6)
    // array boyutu
    println(myArrayList.size)
    // icinde bulunuyor mu
    println(myArrayList.contains(9))
    // deger gore kaldirma
    myArrayList.remove(6)
    // indexe gore kaldirma
    myArrayList.removeAt(0)
    // temizleme
    myArrayList.clear()


    // generic turu belirtmeden icerisine istenilen her turde veri eklemek icin arrayof kullanilir
    // ancak array of immutable arraydir
    var myArrayOf = arrayOf("suleyman", 100, 5.2)
    // eleman eklenemez ancak icerikteki item degistirilebilir
    myArrayOf.set(0, "yeni deger")
    // ayni sekilde doublearrayof ile sadece double alan gibi degisken turu beliritlerekte arrayof tanimlanabilir

}