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

}