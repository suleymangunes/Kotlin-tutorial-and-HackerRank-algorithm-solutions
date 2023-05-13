// sinif olusturularak fieldlara baslangic degeri olarak null atandi
class Phone{
    var name:String?=null
    var color:String?=null

    // override ile stringe ait fonksiyon sinifta kullandi
    // class varsaiylan olarak bu tur metotlari miras alir
    override fun toString(): String {
        return "name: $name\n" +
                "color: $color"
    }
}

// constructor icerisinde name degeri alan sinif olusturuldu
class Computer constructor(name:String){
    var name:String

    // init sinif nesne cagrilinca calisacak ilk kisimdir
    init {
        this.name = name
    }

    override fun toString(): String {
        return "name: $name\n"
    }
}

// hesaplayici sinifi olusturuldu
class Calculator{
    var ilkSayi:Int
    var ikinciSayi:Int

    // constructor icerisinde parametreler tanimlandi
    constructor(ilkSayi:Int, ikinciSayi:Int){
        // tanimlanan parametreler constructor icerisinde tanimlandi
        this.ilkSayi = ilkSayi
        this.ikinciSayi = ikinciSayi
    }

    override fun toString(): String {
        return "ilk sayi: $ilkSayi\n" +
                "ikinci sayi: $ikinciSayi"
    }
}

fun main(){
    // siniftan nesne olusturuldu
    var iphone = Phone()
    // nesne uzerinden sinifin fieldlari degistirildi
    iphone.name = "iphone"
    iphone.color = "black"
    println(iphone)

    // constructor sayesinden nesne uzerinden olmadan fieldlar tanimlandi
    var dell = Computer(name = "dell")
    print(dell)

    var calculator:Calculator = Calculator(10, 20)
    println(calculator)
}