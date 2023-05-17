fun main(){

    var aralik= 1..10

    // kotlinde dongulere isim verilebilir bu sayede ic ice dongulerde istenildigi zaman istenilen dongu kirilabilir
    // hem continue hem de break ile dongu isimleri kullanilabilir
    ilkDongu@for (i in aralik){
        for (j in 1..15){
            println("$i, $j")
            if(j==2){
                // continue ile dongunun bu kismindan itibaren devami atlanir ve dongunun yeni surecine baslnair
                continue
            }
            if(j == 3){
                // break ile istenen dongu kirilabilir
                 break@ilkDongu
                // return ile program tamamiyla durdurulru
                // return
            }
        }
    }

    var deger = 5
    // icerdeki kosul saglandikca dongu devam eder
    while(deger < 10){
        println("degerimiz sudur $deger")
        deger++
    }

    // kosul saglanmasa dahi do bir kez calisir saglansa ise kosul saglandigi surece calisir
    do {
        println("donguden onceki do basladi")
    } while (deger > 11)
}