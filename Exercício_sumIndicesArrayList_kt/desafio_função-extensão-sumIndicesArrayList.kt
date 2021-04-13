
fun ArrayList<Int>.sumIndicesArrayList(sum: Int): ArrayList<Int>{
    for(i in this.indices){
        this[i]= this[i].plus(sum)
    }
    return this
}