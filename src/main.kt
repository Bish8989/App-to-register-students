//Mini school project
val studentsNames = arrayListOf<String>()
val studentsScores = arrayListOf<Double>()
var studentsNumber = 0
var totalScore : Double = 0.0
var averageScore : Double = 0.0
var highScore : Double = -1.0
var indexStudentWithHighScore = 0

fun main() {
   println("Please enter students Number: ")
    studentsNumber = readLine()!!.toInt()
    registerStudents()
println("--------------")
    printStudentsNamesAndScores()

    println("--------------")
    calculateTheAveragesScore()

    println("--------------")
    getTheHigherScore()

}

fun registerStudents(){
    for (i in 1..studentsNumber){
        println("Please enter student $i name:")
        studentsNames.add(readLine().toString())
        println("Please enter student $i score:")
        studentsScores.add(readLine()!!.toDouble())

    }

}

fun printStudentsNamesAndScores(){

    for (i in 0..studentsScores.lastIndex){
        println("${studentsNames[i]} got: ${studentsScores[i]}")
    }
}

fun calculateTheAveragesScore(){

    for (i in 0..studentsScores.lastIndex){
        totalScore += studentsScores[i]
    }

    //averageScore = totalScore / studentsNumber

    averageScore = totalScore / studentsNumber

    println("the average score of class is: $averageScore")

}

fun getTheHigherScore() {

    for (i in 0..studentsScores.lastIndex){
        if (studentsScores[i] > highScore) {
            highScore = studentsScores[i]
            indexStudentWithHighScore = i
        }
}
 println("${studentsNames[indexStudentWithHighScore]} got the highest score: $highScore")
}