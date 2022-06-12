package com.tom

class Student(var name:String,var english:Int,var math:Int) {
    fun print() {
        print(name + "\t" + english + "\t" + math)
        val ave = (english+math)/2
        if (ave>60){
            println("")
        }else if (ave<60){
            println("*")
        }

    }
}
class GraduateStudent(var name:String ,var english:Int ,var math:Int,var thesis:Int) {
    fun print() {
        print(name + "\t" + english + "\t" + math + "\t" + thesis)
    }
}

fun main(){
    val amy = Student("amy ",59,60);
    val ame = Student("ame ",80,70)
    val yoo = GraduateStudent("yoo ",80,80,50);
    amy.print()
    ame.print()
    yoo.print()
}