fun main() {
    // try icerisinde kodlar calisir eger hata olursa program kapanmaz ve catch bloguna gider
    try {
        var a:Int = 5
        var b:Int = 0
        a/b
    // catch blogunda parametre olarak exception tanimlanmalidri
    // hata durumunda bu kisim calisir
    } catch (e:ArithmeticException){
        println(e)
    // her durumda finally kismi calisir
    } finally {
        println("program is done")
    }


    // elvis operatoru ile hata kontrolu yapilir
    // ?: ile hata aranan kisimdan sonra tanimlanir ve devaminda throw firlatarak
    // firlatilmak istenen throw turu tanimlanir
    // bu sayede hata durumunda hata yakalanir
    var x:Int? = null

    var sonuc = x?:throw IllegalArgumentException("null deger tanimli")



}