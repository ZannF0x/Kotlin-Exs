package cadastros

class Cadastro {
    private val conta = mutableMapOf<String, String>()
    var numeroDeCadastro = 1


    fun criarConta(email: String, senha: String){
        conta[email] = senha
    }

    fun exibirCadastros(){
        for(item in conta.entries){
            println("""
               $numeroDeCadastro [ E-mail: ${item.key} | Senha: ${item.value} ]
            """.trimIndent())
            numeroDeCadastro ++
        }
    }

    fun removerCadastro(email: String): Boolean{
        return when(email){
            in conta.keys -> {
                conta.remove(email)
                true
            }
            else -> {
                println("E-Mail não existente")
                false
            }
        }

    }

}