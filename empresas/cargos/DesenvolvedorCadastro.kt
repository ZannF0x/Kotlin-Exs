package empresas.cargos

class DesenvolvedorCadastro
    (nome: String, cpf: String, nivel: String, salario: Double, cargo: String):

    Funcionario(nome, cpf, nivel, salario, cargo){

    override fun auxilio(nivel: String): Double {
        return when(nivel.toLowerCase()){
            "junior" -> ((salario * 10)/100)
            "pleno" ->  ((salario * 20)/100)
            "senior" -> ((salario * 30)/100)
            else -> 0.0
        }
    }


}