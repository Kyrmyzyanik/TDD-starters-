import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class DisplayFormatterTest {
    @Test
    @DisplayName("For an empty list, a predefined message should be returned")
    fun shouldPrintNoOneLikesThisForEmptyList() {
        assertThat(DisplayFormatter.format(listOf())).isEqualTo("There are no names provided!")
    }

    @Test
    @DisplayName("For a single user, their name should be displayed")
    fun shouldPrintSingleUserName() {
        val label: String = DisplayFormatter.format(listOf("Clare"))
        assertThat(label).isEqualTo("Name provided is Clare!")
    }

    @Test
    @DisplayName("For two users, their names should be separated by 'and'")
    fun shouldPrintTwoUserNameWithAnd() {
        val label: String = DisplayFormatter.format(listOf("Clare", "Marcus"))
        assertThat(label).isEqualTo("Names provided are Clare and Marcus!")
    }

    @Test
    @DisplayName("For three users, the first two names should be separated by a comma")
    fun shouldPrintThreeUserNameWithAnd() {
        val label: String = DisplayFormatter.format(listOf("Clare", "Marcus", "Angie"))
        assertThat(label).isEqualTo("Names provided are Clare, Marcus and Angie!")
    }

    @Test
    @DisplayName("For more than three users, the list should be truncated and a number given")
    fun shouldPrintMoreThreeUserName() {
        val label: String = DisplayFormatter.format(listOf("Clare", "Marcus", "Angie", "Jim"))
        assertThat(label).isEqualTo("Names provided are Clare, Marcus and other 2!")
    }
}