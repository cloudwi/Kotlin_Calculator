package domain

enum class Operator(val operator: String) {
    PLUS("+"), SUBTRACT("-")
    ;

    companion object {
        private val LABEL_CACHE: Map<String, Operator> = values().associateBy { it.operator }

        fun findByLabel(label: String) = LABEL_CACHE[label]
    }
}