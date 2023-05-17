// normalde siniflarin varsayilan olarak to string equals gibi metotlari yoktur
// ancak data sinifi verileri barindirarak bu siniflari otomatik olarak kullanilmasina izin verir
data class Veriler(var veri:String){

}

// bu sinifi icin print nesne durumunda nesenin referansını yazar
// ayrica equels kisminda ayni degildirler
class VerilerNormal(var veri:String){

}

fun main() {
    var veriler:Veriler = Veriler("suleyman")
    // nesne print icerisinde yazilinca tostring varmis gibi davranir ve fieldlari yazdirir
    println(veriler)

    // direkt olarak copy ile nesneyi kopyalarak yeni nesne olusturabilir
    var wong = veriler.copy("wong")
    print(wong)

    // ayrica sinif fieldlari tuple icerisine eklenebilir
    var(isim) = wong

    // bu ozellikler normal sinifta kullanilmaz data sinifina ozgudur
}