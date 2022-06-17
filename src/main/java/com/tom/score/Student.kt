package com.tom.com.tom.score

class Student (var name:String,var english:Int,var math:Int){
    init {
        println()
    }
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}")
    }
    fun getAverage() = (english+math)/2

}

fun main() {
    val stu = Student("Jack",55,87)
    stu.print()
}