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

    println("Array usando a extensão sumIndicesList: ${listNum.sumIndicesArrayList(choiceNum)}") //Soma + 10 a cada
    //item de um arrayListOf<Int>
}
fun ArrayList<Int>.sumIndicesArrayList(sum: Int): ArrayList<Int>{
    for(i in this.indices){
        this[i]= this[i].plus(sum)
    }
    return this
}