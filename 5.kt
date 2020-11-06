fun main() {
    
    var kota = arrayOf("Jakarta","Jakarta","Padang","Solo","Padang","Bandung","Padang","Malang","Bali")
	for (name in kota){
        val counter = kota.groupingBy { it }.eachCount()
        if (name.equals("Jakarta")){
			println("jakarta: $counter")
        }
    }
}

//mas, saya gak tau function nya yg tepat, kasi tau mas gimana function yg benar
