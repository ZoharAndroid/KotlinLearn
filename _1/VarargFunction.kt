package zohar.com.myapplication._1

fun main(){
    fun printAll(vararg message : String){
        for (m in message){
            println(m)
        }
    }

    println("printAll")
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")

    fun printAllWithPrefix(vararg message : String, prefix : Int ){
        for (m in message){
            println("$prefix   $m")
        }
    }
    println("printAllWithPrefix")
    printAllWithPrefix("Hello", "Hallo", "Salut", "Hola", "你好", prefix = 1)

    fun log(vararg entries : String){
        printAll(*entries)
    }
}