package calculatorInfrastructure

import java.lang.IllegalArgumentException

class CalculatorIO {

    fun enterInt(): Int {
        return converterInt(readlnOrNull())
    }

    fun enterString() : String {
        return readlnOrNull() ?: ""
    }

    fun produce(message: String) {
        print("""
            $message
        """.trimIndent())
    }

    private fun converterInt(input: String?): Int {
        try {
            return input?.toInt() ?: throw IllegalArgumentException()
        } catch (e: Exception) {
            throw IllegalArgumentException("숫자를 입력 하셔야 합니다.")
        }
    }
}