fun main(){
    val rangeNum = (0..100)
    val listNum = arrayListOf<Int>(
        rangeNum.random(),
        rangeNum.random(),
        rangeNum.random(),
        rangeNum.random(),
        rangeNum.random(),
        rangeNum.random())

    println("Array não alterado: $listNum")
    print("Escolha um número para somar: ")
    val choiceNum: Int = readLine()!!.toInt()

    println("Array usando a extensão sumIndicesList: ${listNum.sumIndicesArrayList(choiceNum)}")
}