fun main() {
    var nilai2 = sample2(12.9,5.9)
    println(nilai2)
}

fun sample2(a : Double,b : Double):String{
    var angka = a.toString()
    var angka2 = b.toString()
    return "$angka $angka2"    
}