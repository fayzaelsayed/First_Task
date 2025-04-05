package ipv4

fun main() {
    print(isIPv4Valid("255.255.255.255"))
}

fun isIPv4Valid(appliedIPv4: String): Boolean {
    if (appliedIPv4.isEmpty() || appliedIPv4 != appliedIPv4.trim()) {
        return false
    }

    val separatedSegments = appliedIPv4.split('.')
    if (separatedSegments.size != 4) {
        return false
    }

    for (segment in separatedSegments) {
        when {
            segment.isEmpty() -> return false
            segment.any { !it.isDigit() } -> return false
            segment.length > 1 && segment[0] == '0' -> return false
            segment.toIntOrNull() !in 0..255 -> return false
        }
    }

    return true
}