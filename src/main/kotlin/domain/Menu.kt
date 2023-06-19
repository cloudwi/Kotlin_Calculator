package domain

enum class Menu(val menu: Int) {
    CALCULATION(1),
    END(0)
    ;

    fun getName(): String {
        return this.name
    }

    companion object {
        private val LABEL_CACHE: Map<Int, Menu> = values().associateBy { it.menu }

        fun findByLabel(label: Int) = LABEL_CACHE[label]
    }
}