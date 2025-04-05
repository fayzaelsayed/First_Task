package ipv4

fun main() {
    check(
        name = "when enter IP separated by dots more than three return false",
        result = isIPv4Valid("11.22.33.44.55"),
        correctResult = false
    )

    check(
        name = "when enter IP separated by dots less than three return false",
        result = isIPv4Valid("11.22.33"),
        correctResult = false
    )

    check(
        name = "when enter IP separated by more than one dot return false",
        result = isIPv4Valid("11..22..33..44"),
        correctResult = false
    )

    check(
        name = "when enter IP separated by characters not dots return false",
        result = isIPv4Valid("11a22a33a44"),
        correctResult = false
    )

    check(
        name = "when enter IP separated by special characters not dots return false",
        result = isIPv4Valid("11@22@33@44"),
        correctResult = false
    )

    check(
        name = "when enter IP separated by spaces not dots return false",
        result = isIPv4Valid("11 22 33 44"),
        correctResult = false
    )

    check(
        name = "when enter IP without any separation return false",
        result = isIPv4Valid("11223344"),
        correctResult = false
    )

    check(
        name = "when enter empty IP return false",
        result = isIPv4Valid(""),
        correctResult = false
    )

    check(
        name = "when enter blank IP return false",
        result = isIPv4Valid("  "),
        correctResult = false
    )

    check(
        name = "when enter IP with segment not numeric return false",
        result = isIPv4Valid("aa.11.22.33"),
        correctResult = false
    )

    check(
        name = "when enter IP with more than segment not numeric return false",
        result = isIPv4Valid("aa.11.bb.22"),
        correctResult = false
    )

    check(
        name = "when enter IP with negative segment number return false",
        result = isIPv4Valid("-11.22.33.44"),
        correctResult = false
    )

    check(
        name = "when enter IP with several negative segment number return false",
        result = isIPv4Valid("-11.22.-33.44"),
        correctResult = false
    )

    check(
        name = "when enter IP with positive segment more than 255 return false",
        result = isIPv4Valid("256.11.22.33"),
        correctResult = false
    )

    check(
        name = "when enter IP with several positive segment more than 255 return false",
        result = isIPv4Valid("256.11.256.33"),
        correctResult = false
    )

    check(
        name = "when enter IP with empty segment return false",
        result = isIPv4Valid(".11.22.33"),
        correctResult = false
    )

    check(
        name = "when enter IP with several empty segments return false",
        result = isIPv4Valid(".11..33"),
        correctResult = false
    )

    check(
        name = "when enter IP with blank segment return false",
        result = isIPv4Valid(" .11.22.33"),
        correctResult = false
    )

    check(
        name = "when enter IP with several blank segments return false",
        result = isIPv4Valid(" .11. .33"),
        correctResult = false
    )

    check(
        name = "when enter IP with segment has leading zero return false",
        result = isIPv4Valid("01.22.33.44"),
        correctResult = false
    )

    check(
        name = "when enter IP with segment has several leading zeros return false",
        result = isIPv4Valid("001.22.33.44"),
        correctResult = false
    )

    check(
        name = "when enter IP with several segments have leading zero return false",
        result = isIPv4Valid("01.02.33.44"),
        correctResult = false
    )

    check(
        name = "when enter IP with several segments have several leading zeros return false",
        result = isIPv4Valid("001.002.33.44"),
        correctResult = false
    )

    check(
        name = "when enter IP separated by three dots return true",
        result = isIPv4Valid("11.22.33.44"),
        correctResult = true
    )

    check(
        name = "when enter IP with numeric segment value 0 return true",
        result = isIPv4Valid("0.22.33.44"),
        correctResult = true
    )

    check(
        name = "when enter IP with several 0 segments return true",
        result = isIPv4Valid("0.0.33.44"),
        correctResult = true
    )

    check(
        name = "when enter IP with positive segments less than 255 return true",
        result = isIPv4Valid("11.22.33.44"),
        correctResult = true
    )

    check(
        name = "when enter IP with positive segments equal 255 return true",
        result = isIPv4Valid("255.255.255.255"),
        correctResult = true
    )

}

private fun check(name: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult) {
        println("Success $name")
    } else {
        println("Fail $name")
    }
}