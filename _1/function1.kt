package zohar.com.myapplication._1

fun main(){
    printMessage("Hello World")
    printMessageWithPrefix("Hello");
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1,2))
    println(multiply(1,2))
}

fun printMessage(message : String): Unit {
    println(message)
}

fun printMessageWithPrefix(message : String, prefix : String = "Info"): Unit{
    println("[$prefix]  $message")
}

fun sum(x : Int, y : Int): Int{
    return x+y
}

fun multiply(x : Int, y : Int): Int{
    return x * y;
}