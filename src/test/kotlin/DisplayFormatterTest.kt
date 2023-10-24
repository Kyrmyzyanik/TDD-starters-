import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class DisplayFormatterTest {
    @Test
    @DisplayName("For an empty list, a predefined message should be returned")
    fun shouldPrintNoOneLikesThisForEmptyList() {
        assertThat(DisplayFormatter().format(listOf())).isEqualTo("There are no names provided!")
    }

    @Test
    @DisplayName("For a single user, their name should be displayed")
    fun shouldPrintSingleUserName() {
        val label: String = DisplayFormatter().format(listOf("Clare"))
        assertThat(label).isEqualTo("Name provided is Clare!")
    }
}