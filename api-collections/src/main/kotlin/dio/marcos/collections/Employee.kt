package dio.marcos.collections

data class Employee (                                           //-> Uma data class para criação dos valores
    val name:String,
    val salary:Double,
    val jobType:String
) {
    override fun toString(): String =                           //-> Alterando o retorno do .toString() da classe
        """
            Name: $name | Salary: $ $salary
        """.trimIndent()
}