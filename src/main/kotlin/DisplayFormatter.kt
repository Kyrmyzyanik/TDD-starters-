object DisplayFormatter {
    //Challenge: try to refactor 0 case message
    fun format(names: List<String?>?): String {
        names?.let {
            val verb = if (it.size > 1) "are" else "is"
            val suffix = if (it.size > 1) "s" else ""
            return String.format("Name%s provided %s %s!",suffix, verb, concatenate(it))
        } ?: run {
            return "There are no names provided!"
        }
    }
    //Challenge: try to refactor 0 case message
    private fun concatenate(names: List<String?>): String? {
        return when (names.size) {
            1 -> names[0]
            2 -> String.format("%s and %s", names[0], names[1])
            3 -> String.format("%s, %s and %s", names[0], names[1], names[2])
            else -> String.format("%s, %s and other %s", names[0], names[1], names.size - 2)
        }
    }
}