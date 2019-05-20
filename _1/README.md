
[toc]

# 介绍

## 1. Hello World

新建一个kotlin文件，可以发现kotlin文件是以.kt结尾的。下面来写一个HelloWorld的代码：

```kotlin
package zohar.com.myapplication._1  // 1

fun main(){                         // 2
    println("Hello World")          // 3
}
```

> 1. 定义的包，Kotlin代码定义在相应的包里面
> 2. main是程序的入口点，用fun修饰说明是方法。在Kotlin 1.3版本以上可以在main()方法中不指定参数；这里没有指定返回值类型，所以也就意味着没有返回值.
> 3. println()方法是标准的输出方法。语句后面可带分号也可不带分号( ; )，这是一个可选的。

另外：1.3版本一下的main方法书写

```kotlin
fun main(args : Array<String>) {
    println("Hello World")
}
```

## 2. 方法

### 2.1 默认参数值和方法

```kotlin
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

输出：
Hello World
[Info]  Hello
[Log]  Hello
[Log]  Hello
3
2
2
```

> 1. 一个简单的输出message字符串的方法，Unit是返回值类型，相当于void，不过这里可以省略。
> 2. 可以打印带前缀的信息，可以给参数设定默认值，如果方法里面的语句没有对设定默认值的参数再次进行赋值，那么就会使用默认设定的值。
> 3. 带返回值的方法。
> 4. 带返回值的乘法。
> 5. 简单写法。

### 2.2 infix关键字的使用

```kotlin
package zohar.com.myapplication._1


fun main(){
    infix fun Int.times(str : String) : String {
        return str.repeat(this)
    }
    println(2 times "Bye ")
    println(2.times("Bye "))

    val pair = "abcdef" to "hahahaha"
    println(pair)

    infix fun String.onto(other : String) : Pair<String, String> {
        return Pair(this, other)
    }
    val pair2 = "abcdef" onto "hahahaha"
    val pair3 = "abcdef".onto("hahahaha")
    println(pair2)
    println(pair3)

    val haha = Person("HAHA")
    val xixi = Person("XIXI")
    haha.likes(xixi)
    haha likes xixi
}

class Person(val name : String){
    // 定义了一个列表
    val likedPeople = mutableListOf<Person>()
    // 方法的功能就是让将一个 Person对象加入到likePeople列表中
    infix fun likes(other : Person){
        likedPeople.add(other)
    }
}

输出:
Bye Bye 
Bye Bye 
(abcdef, hahahaha)
(abcdef, hahahaha)
(abcdef, hahahaha)
```

> 用infix关键字标记的函数也可以使用中缀表示法调用（省略点和调用的括号）
> 
> 中缀函数必须满足以下要求：
> 
> * 它们必须是成员函数或扩展函数
> * 它们必须有一个参数
> * 参数不能接受可变数量的参数，并且必须没有默认值

### 2.3 operator关键字

```kotlin
package zohar.com.myapplication._1


fun main(){
    operator fun Int.times(str : String) = str.repeat(this)
    println(2.times("Bye "))
    println(2 * "Bye ")

    operator fun String.get(range : IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])
}

输出：
Bye Bye 
Bye Bye 
Always forgive 
```

> 1. times对应的运算操作符为'*'，所以这里可以将方法用operator关键字进行声明。
> 2. get方法可以用[1..14]来来进行替代

### 2.3 vararg关键字的多变量参数

```kotlin
package zohar.com.myapplication._1

fun main(){
    fun printAll(vararg message : String){
        for (m in message){
            println(m)
        }
    }

    println("printAll:")
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")

    fun printAllWithPrefix(vararg message : String, prefix : Int ){
        for (m in message){
            println("$prefix   $m")
        }
    }
    println("printAllWithPrefix:")
    printAllWithPrefix("Hello", "Hallo", "Salut", "Hola", "你好", prefix = 1)

    fun log(vararg entries : String){
        printAll(*entries)
    }
}

输出：
printAll:
Hello
Hallo
Salut
Hola
你好
printAllWithPrefix:
1   Hello
1   Hallo
1   Salut
1   Hola
1   你好
```

> 1. vararg关键字用来修饰可变的参数

## 3. 变量

Kotlin有强大的类型推断能力，所以一下语句都是可以的

```kotlin
var s : String = "inital"
println(s)
var s1 = "Inital"
println(s1)
var a : Int
a = 3
var a1 = 3
println(a)
println(a1)

输出:
inital
Inital
3
3
```
> 在使用变量之前，一定要先初始化

## 4. NULL安全
