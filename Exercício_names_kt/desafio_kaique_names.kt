val filterNames = arrayListOf<String>("de", "da", "do", "das", "dos" )

fun main(){
    print("Digite seu nome completo: ")
    val name: String = readLine()!!.toString().toLowerCase()

    val listName = name.split(" ") as ArrayList<String>

    for(items in listName.indices){

        if(listName[items] !in filterNames) {

            if (listName[items] == listName.first() || listName[items] == listName.last()) {
                print(listName[items].capitalize() + " ")

            }else{
                print(listName[items].capitalize()[0] + ". ")

            }
        }

    }
}


