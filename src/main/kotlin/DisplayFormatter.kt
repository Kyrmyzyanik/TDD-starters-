object DisplayFormatter {
    fun format(names: List<String?>): String {
        val verb = if (names.size > 1) "are" else "is"
        val suffix = if (names.size > 1) "s" else ""
        return String.format("Name%s provided %s %s!",suffix, verb, concatenate(names))
    }
    private fun concatenate(names: List<String?>): String? {
        return when (names.size) {
            0 -> "null"
            1 -> names[0]
            2 -> String.format("%s and %s", names[0], names[1])
            3 -> String.format("%s, %s and %s", names[0], names[1], names[2])
            else -> String.format("%s, %s and other %s", names[0], names[1], names.size - 2)
        }
    }
}