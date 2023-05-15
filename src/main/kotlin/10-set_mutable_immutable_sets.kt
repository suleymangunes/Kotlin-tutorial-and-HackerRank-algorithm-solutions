fun main() {
    // setler kumeler olarak tanimlanir matematikteki kumede oldugu gibi setlere ayni itemden birden fazla kez eklenemez
    // setof immutable bir kumedir elemanlari degisemez ve eleman eklenip cikarilamaz
    var mySet = setOf("burdaki degerler", "degistirilemez", 4, null)
    println(mySet.size)
    for (i in mySet){
        println(i)
    }

    // mutableset of muttable bir kumedi matematikteki kume ozelliklerine yine tanir
    // ancak mutable oldugundan elemanlar guncellenebilir eklenebilir ve cikarilablir
    var mySetMutable = mutableSetOf("bu degerler", "degistirileblir", 5, null)

    mySetMutable.add(5)
    mySetMutable.remove(null)

    for (i in mySetMutable){
        println(i)
    }

    mySetMutable.clear()
}
