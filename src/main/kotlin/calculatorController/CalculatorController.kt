package calculatorController

import calculatorInfrastructure.CalculatorIO
import calculatorService.CalculatorService
import common.Messages
import domain.Operator
import java.lang.IllegalArgumentException

class CalculatorController {

    private val calculatorService: CalculatorService = CalculatorService()
    private val calculatorIO: CalculatorIO = CalculatorIO()

    fun calculation() {
        calculatorIO.produce(Messages.FIRST_NUMBER_INPUT.message)
        val number1: Int = calculatorIO.enterInt()

        calculatorIO.produce(Messages.OPERATOR.message)
        val operator: String = calculatorIO.enterString()

        calculatorIO.produce(Messages.SECOND_NUMBER_INTPUT.message)
        val number2: Int = calculatorIO.enterInt()

        val result: Int = when (Operator.findByLabel(operator)) {
            Operator.PLUS -> calculatorService.plus(number1, number2)
            Operator.SUBTRACT -> calculatorService.subtract(number1, number2)
            else -> throw IllegalArgumentException(Messages.OPERATOR_SELECTION_EXCEPTION.message)
        }

        calculatorIO.produce(Messages.RESULT.message + result + Messages.LINE_BREAK.message)
    }
}
