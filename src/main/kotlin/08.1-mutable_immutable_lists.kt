
fun main() {
    // immutable listeler
    // immutable listelerde icerikte degisiklik olmaz ayrica eleman ekleme ciakrma gibi islemler yapilamaz
    // icerisine null dahil her sey eklenebilir tabiki tur generic olarak belirtilmedigi surece
    var myImmutableList = listOf("suleymna", null, 4)

    for (i in myImmutableList){
        println(i)
    }

    // bir diger immutable list olan listofnotnull ile yine ayni sekilde degerlerinin guncellenmedigi
    // eleman eklenip cikartilmayan liste olusturulur ancak bu null kullanilmaz
    // eklenebilir ancak kullanilmak istediginde nullu gormez
    var myImmutableListNotNull = listOfNotNull("suleyman", null, 4)

    for (i in myImmutableListNotNull){
        println(i)
    }

    // mutable listeler
    // icerigine deger eklenip silinebilen ayrica degerlerin degisebilecegi mutable listeler olusturuldu
    var liste = arrayListOf("suleyman", 'a', 4, null)
    liste.add(5)
    liste.remove(4)

    var liste2 = mutableListOf("suleyman", 'a', 4, null)
    liste2.add(5)
    liste2.remove(4)





}
