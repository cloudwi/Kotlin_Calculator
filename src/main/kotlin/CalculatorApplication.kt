import calculatorController.CalculatorController
import calculatorInfrastructure.CalculatorIO
import common.Messages
import domain.Menu

class CalculatorApplication {

    private val calculatorIO: CalculatorIO = CalculatorIO()
    private val calculatorController: CalculatorController = CalculatorController()

    private var power: Boolean = true

    fun calculatorApplication() {
        while (power) {
            try {
                calculatorIO.produce(Messages.MENU_SELECTION.message)

                val input: Int = calculatorIO.enterInt()

                when (Menu.findByLabel(input)) {
                    Menu.CALCULATION -> calculatorController.calculation()
                    Menu.END -> power = false
                    else -> throw IllegalArgumentException(Messages.MENU_SELECTION_EXCEPTION.message)
                }
            } catch (e: Exception) {
                calculatorIO.produce(e.message ?: "")
            }
        }

        return
    }
}