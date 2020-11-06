fun main() {
    var finalExam : Int = 81
    when (finalExam) {
        in 60..80 -> println("memuaskan")
        in 80..90 -> println("sangat memuaskan")
        in 90..100 -> println("terpuji")
        in 0..60 -> println("tidak lulus")
        else -> println("Nilai tidak valid")
    }
}
