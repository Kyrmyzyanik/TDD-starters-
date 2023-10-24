object DisplayFormatter {
    fun format(names: List<String?>?): String {
        names?.let {
            val name = if (it.isEmpty()) return "There are no names provided!" else concatenate(it)
            val verb = if (it.size > 1) "are" else "is"
            val suffix = if (it.size > 1) "s" else ""
            return String.format("Name%s provided %s %s!", suffix, verb, name)

        } ?: run {
            return "There are no names provided!"
        }
    }

    private fun concatenate(names: List<String?>): String {
        if (names.size > 3) {
            return String.format("%s, %s and other %s", names[0], names[1], names.size - 2);
        }

        var joined: String = java.lang.String.join(" and ", names)
        if (names.size == 3) {
            joined = joined.replaceFirst(" and ".toRegex(), ", ")
        }
        return joined
    }
}