fun main() {

    // icerisinde 10 tane eleman olan ve her biri 0 degerinde int olan array olusturuldu
    // generic olarak int belirtildi bu sayede bu array sadede int alacaktir
    // array icerigi degistirileblir ve eleman eklenebilir
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


}