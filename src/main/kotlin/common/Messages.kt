package common

enum class Messages(val message: String) {
    MENU_SELECTION(
        """
        메뉴 선택
        1. 계산
        0. 종료
        
    """.trimIndent()
    ),
    MENU_SELECTION_EXCEPTION(
        """
        정확한 메뉴를 선택해주세요!
        
    """.trimIndent()
    ),
    OPERATOR_SELECTION_EXCEPTION(
        """
        정확한 메뉴를 선택해주세요!
        
    """.trimIndent()
    ),
    FIRST_NUMBER_INPUT(
        """
        첫번째 숫자 : 
    """.trimIndent()
    ),
    OPERATOR(
        """
        연산자 : 
    """.trimIndent()
    ),
    SECOND_NUMBER_INTPUT(
        """
        두번째 숫자 : 
    """.trimIndent()
    ),
    RESULT(
        """
        결과 : 
    """.trimIndent()
    ),
    LINE_BREAK("""
        
        
    """.trimIndent())

}