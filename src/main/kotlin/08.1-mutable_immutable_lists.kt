
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


}
