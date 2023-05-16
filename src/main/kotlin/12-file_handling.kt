import java.io.FileReader
import java.io.FileWriter

fun main() {

    var path = "src/main/kotlin/12-dosya.txt"
    // dosya olusturmak icin writer uzerinden olusturma yapilir

    var dosya = FileWriter(path)

    // append true ile dosyaya ekleme islemi yapilmasi icin ortam olusturuldu
    var dosyaYaz = FileWriter(path, true)
    // write ile ekleme yapildi
    dosyaYaz.write("suleyman")
    dosyaYaz.write(" gunes\n")
    dosyaYaz.write("david")
    dosyaYaz.write(" fincher")
    // yazma islemi bitince dosyanin kapatilmasi saglandi
    dosyaYaz.close()

    // dosya okumak icin filereader methodu kullanildi
    var dosyaOku = FileReader(path)

    var okunanVeri:Int

    do {
        // dosyayi harf harf okur ve okudug degeri ascii olarak donderir
        // bu yuzden her defasinda ascii deger to char ile char degiskenine donsuturuluru
        okunanVeri = dosyaOku.read()
        print(okunanVeri.toChar())
        // eger veri yok ise -1 donderir bu sonuc cikana kadar dongunun donmesi saglandi
    } while (okunanVeri != -1)
    // islem bittikten sonra dosya kapatildi
    dosyaOku.close()






}