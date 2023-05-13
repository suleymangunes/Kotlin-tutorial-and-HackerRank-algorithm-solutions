// soyut siniflar farkli siniflarin ortak yapisini kullanir ve bunlar icin bir kimlik yapisi sunar
// soyut siniftan turetilen siniflar soyut sinif kimligine sahiptir
// icerisinden fieldlar tanimlananbilri
// fonksiyonlar tanimlanabilir
// soyut sinif tanimlamak icin abstract kullanilir
// ayrica fieldlari ve fonksiyonlara da abstract ile soyut ozelligi kazandirilabilir
abstract class IFetchData{
    abstract var baseUrl:String
    abstract var path:String

    abstract fun getData()
    fun showStrings():String{
        return "baseURl: $baseUrl\n" +
                "path: $path"
    }
}

// soyut sinifi miras almak icin ayni sekilde : ile soyut sinif ismi yazilir
// soyut sinif icerisindeki soyut fieldlerin da override edilemsi gerekir
// ayrica soyut metotlarin da override edilemsi gerekir
class FetchDataService(override var baseUrl: String, override var path: String):IFetchData(){
    override fun getData() {
        println("veriler aliniyor")
    }
}

fun main(){
    // olusturulan ornek turu oalrak soyut sinifi turu verilebilir
    var fetchDataService:IFetchData = FetchDataService("api", "/login")
    fetchDataService.getData()
    print(fetchDataService.showStrings())
}