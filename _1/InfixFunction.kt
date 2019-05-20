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
}

class Person(val name : String){
    // 定义了一个列表
    val likedPeople = mutableListOf<Person>()
    // 方法的功能就是让将一个 Person对象加入到likePeople列表中
    infix fun likes(other : Person){
        likedPeople.add(other)
    }
}