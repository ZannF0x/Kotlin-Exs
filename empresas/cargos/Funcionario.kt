package empresas.cargos

abstract class Funcionario(
    nome: String,
    cpf: String,
    var nivel: String,
    var salario: Double,
    var cargo: String

): Pessoa(nome, cpf){

    protected abstract fun auxilio(nivel: String): Double

    override fun toString(): String = """
        
        [Relatório]
        >>> Nome: $nome
        >>> CPF: $cpf
        >>> Cargo: $cargo
        >>> Nivel: $nivel
        >>> Salário: $salario
        >>> Auxílio: ${auxilio(nivel)}
        >>> Total: ${auxilio(nivel) + salario}
        
    """.trimIndent()
}