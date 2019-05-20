package zohar.com.myapplication._1


fun printMessage(message : String): Unit {  // 1
    println(message)
}

fun printMessageWithPrefix(message : String, prefix : String = "Info"): Unit { // 2
    println("[$prefix]  $message")
}

fun sum(x : Int, y : Int): Int{ // 3
    return x+y
}

fun multiply(x : Int, y : Int): Int{ // 4
    return x * y
}

fun multiply2(x : Int, y : Int) = x * y // 5


fun main(){
    printMessage("Hello World")
    printMessageWithPrefix("Hello");
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1,2))
    println(multiply(1,2))
    println(multiply2(1,2))
}