class DisplayFormatter {
    fun format(names: List<String?>?): String {
        names?.let {
            val name = if (it.isEmpty()) "There are no names provided!" else it[0]
            return String.format("Name provided is %s!", name)
        } ?: run {
            return "There are no names provided!"
        }
    }
}