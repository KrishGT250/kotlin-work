// Name: Krish Punjabi
// Student ID: 202025852

fun redact(doc: String, target: String, redactChar: Char = 'X'): String {
    if (target.isEmpty()) {
        return doc
    }

    val replacement = redactChar.toString().repeat(target.length)

    return doc.replace(target, replacement)
}
