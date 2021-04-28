package empresas.cargos.testes
import empresas.cargos.DesenvolvedorCadastro
import empresas.cargos.Funcionario
import java.lang.Exception

fun main(){

    while(true){
        try {
            print("Deseja fazer um cadastro de funcionário? [1 = Sim / 0 = Não]: ")
            val command: Int = readLine()!!.toInt()

            if(command != 1 && command != 0){
              println("ERRO! Comando não reconhecido. \n")
              continue
            }else if(command == 0){
                println("Saindo do Programa...")
                break
            }

            print("Nome: ")
            val nome: String = readLine()!!.toString()
            print("CPF: ")
            val cpf: String = readLine()!!.toString()
            print("Cargo na Empresa: ")
            val cargo: String = readLine()!!.toString()
            print("Nivel [junior, pleno, senior]: ")
            val nivel: String = readLine()!!.toString().toLowerCase()
            print("Salário: ")
            val salario: Double = readLine()!!.toDouble()

            val contratado = DesenvolvedorCadastro(
                nome = nome,
                cpf = cpf,
                nivel = nivel,
                salario = salario,
                cargo = cargo )

            imprimeRelatorio(contratado)
        }
        catch (e: Exception){
            println("\nERRO! Dado Incorreto.")
            continue
        }
    }


}
fun imprimeRelatorio(contratado: Funcionario) = println(contratado.toString())