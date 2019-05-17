
# 介绍

## 1. Hello World

新建一个kotlin文件，可以发现kotlin文件是以.kt结尾的。下面来写一个HelloWorld的代码：
```
package zohar.com.myapplication._1  // 1

fun main(){                         // 2
    println("Hello World")          // 3
}
```
> 1. 定义的包，Kotlin代码定义在相应的包里面
> 2. main是程序的入口点，用fun修饰说明是方法。在Kotlin 1.3版本以上可以在main()方法中不指定参数；这里没有指定返回值类型，所以也就意味着没有返回值.
> 3. println()方法是标准的输出方法。语句后面可带分号也可不带分号(;)，这是一个可选的。

另外：1.3版本一下的main方法书写
```
fun main(args : Array<String>) {
    println("Hello World")
}
```

# 2.
