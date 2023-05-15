fun main() {
    // İmmutable map
    // map icerisine key value seklinde veriler tanimlanir
    // key degerleri benzersiz olmalidir
    // immutable oldugundan veri eklenmez cikarilmaz ve verilerde degisiklik yapilmaz
    var mymap = mapOf<Char, String>('a' to "karsilik", 'b'  to "ikinci karsilik")
    println(mymap['a'])
    println(mymap.get('a'))

    for (i in mymap){
        println(i)
    }

    // mutable map
    // hash map mutable bir maptir
    // icerigi degistirilebilir veri eklenebilir ve kaldirilabilir
    var myHashMap = hashMapOf<Int, String>(1 to "suleyman", 2 to "kar wai")
    println(myHashMap.get(1))
    myHashMap.set(3, "david")
    myHashMap.put(1, "daniel")
    myHashMap.remove(1)
    for (i in myHashMap){
        println(i)
    }

    // ayni sekilde mutablemapofta mutable bir map turudur
    // hashmap ile yapilanlar bununla da yapilir
    var myMutableMap = mutableMapOf<Int, Int>(1 to 2, 3 to 3)

}