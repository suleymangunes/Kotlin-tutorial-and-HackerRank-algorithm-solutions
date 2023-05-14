class AccessModifiers{
    // kotlinde varsayilan olarak public olarak fieldlar tanimlanir
    var defaultDegisken:Int = 5
    // public degiskenlere her yerden erisilebliri
    public var ulasilabilirDegisken:Int = 5
    // private degiskene yalnizca sinif icerisinden erisilebilir
    private var ulasilamazDegisken:Int = 5
    // protected sadece ayni dosyadan ve miras alininan siniftan erisileblir
    protected var sadeceMirastan:Int = 5
    // internal ile sadece modul uzerinden erisim saglanir
    internal var sadeceAyniModul:Int = 5
}

fun main() {

}