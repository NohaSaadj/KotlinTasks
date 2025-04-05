
fun ipv4Checker(ipV4: String): Boolean {
    //("255.255.255.255")
    //["255","255","255","255"]
    val segments = ipV4.split('.')
    if(segments.size != 4){
        return false
    }

    for (segment in segments ){
        if (segment.length >3 || segment.isEmpty()){
            return false
        }

        if (segment.any() { !it.isDigit()}){
            return false
        }

        if (segment.startsWith('0') && segment.length >1){
            return false
        }

        val number= segment.toIntOrNull() ?: return false

            if(number !in 0..255){
                return false
            }
    }

    return true
}