package cadastros


import kotlin.Exception

val CONTA = Cadastro()
    var loopPrincipal = true
    val listaContas = mutableListOf<String>()
    var quantidadeCadastrados = 0

fun main() {

    println("[CADASTRO DE CLIENTES]")

    while (loopPrincipal){

        while (true){
            print("\nDeseja fazer um cadastro? [S = 'Sim' / N = 'Não']>>> ")
            val command: String = readLine()!!.toString().uppercase().strip()

            if(command == "N"){
                break
            } else if (command !in "N" && command !in "S"){
                println("Comando invalido. Tente novamente!")
                continue
            }

            while(true) {
                print("\nDigite seu E-mail: ")
                val newEmail: String = readLine()!!.toString().strip()

                print("Digite sua senha: ")
                val newSenha: String = readLine()!!.toString().strip()


                if (newEmail in listaContas || newSenha in listaContas){

                    println("E-mail (e)ou senha já existente(s). Tente novamente!")
                    continue

                } else if ("@" !in newEmail || "gmail" !in newEmail || ".com" !in newEmail || newSenha.length < 8) {

                    println("E-mail (e)ou Senha invalido(s). Tente novamente!")
                    continue

                } else {

                    CONTA.criarConta(newEmail, newSenha)
                    listaContas.add(newEmail)
                    listaContas.add(newSenha)
                    quantidadeCadastrados ++
                    break
                }

            }
        }

        while (true){
            println("""
                
            Quantidade de pessoas cadastradas: $quantidadeCadastrados
            -----------------------    
            0 - [Sair]               
            1 - [Exibir Cadastros]
            2 - [Remover Cadastro]
            3 - [Fazer um novo Cadastro]
            -----------------------    
            """.trimIndent())
            try {
                print("O que deseja fazer?>>> ")
                when (readLine()!!.toInt()) {

                    0 -> {
                        loopPrincipal = false
                        break
                    }
                    1 -> {
                        println("\nCadastros:")
                        CONTA.exibirCadastros()
                    }
                    2 -> {
                        print("Digite o E-mail do cadastro para remover: ")
                        val removeEmail = readLine()!!.toString()
                        if (CONTA.removerCadastro(removeEmail)) {
                            quantidadeCadastrados--

                            listaContas.remove(removeEmail)
                            listaContas.removeAt(listaContas.indexOf(removeEmail) + 1)
                        }


                    }
                    3 -> break

                }
            }catch (e: Exception){
                println("ERRO! Digite apenas números inteiros.")
                continue
            }
        }
    }
    println("Volte sempre!")
}