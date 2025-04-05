
fun main(){

    ipV4testing(
        name = "Should return true for a valid IP",
        Result = ipv4Checker("192.168.0.1"),
        CorrectResult = true
    )

    ipV4testing(
        name = "Should return true when the IP has only zeros ",
        Result = ipv4Checker("0.0.0.0"),
        CorrectResult = true
    )

    ipV4testing(
        name = "Should return true when the IP has the same numbers ",
        Result = ipv4Checker("255.255.255.255"),
        CorrectResult = true
    )

    ipV4testing(
        name = "Should return false when it contains a negative number",
        Result = ipv4Checker("150.-12.255.255"),
        CorrectResult = false
    )

    ipV4testing(
        name = "Should return false when it starts with zero",
        Result = ipv4Checker("01.127.255.1"),
        CorrectResult = false
    )


    ipV4testing(
        name = "Should return false when it contains a character",
        Result = ipv4Checker("122.255.n.1"),
        CorrectResult = false
    )

    ipV4testing(
        name = "Should return false when it contains a character",
        Result = ipv4Checker("#.127.255.1"),
        CorrectResult = false
    )

    ipV4testing(
        name="Should return false when the IP has some empty numeric segment",
        Result= ipv4Checker("1..255."),
        CorrectResult = false
    )

    ipV4testing(
        name="Should return false when the IP is totally empty",
        Result= ipv4Checker(""),
        CorrectResult = false
    )

    ipV4testing(
        name="Should return false when it contains a number bigger than 255",
        Result= ipv4Checker("277.80.25.32.0"),
        CorrectResult = false
    )
    ipV4testing(
        name="Should return false when it does not contain any dots",
        Result= ipv4Checker("18789020"),
        CorrectResult = false
    )

    ipV4testing(
        name="Should return false when it contains less than three dots",
        Result= ipv4Checker("16.156.99"),
        CorrectResult = false
    )

    ipV4testing(
        name="Should return false when it contains more than three dots",
        Result= ipv4Checker("16.156.99.34.5"),
        CorrectResult = false
    )

}

fun ipV4testing(name: String, Result:Boolean, CorrectResult:Boolean) {
    if (Result == CorrectResult) {
        println("Correct - $name")
    } else {
        println("Failed - $name")
    }
}