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
        return java.lang.String.join(" and ", names)
    }
}