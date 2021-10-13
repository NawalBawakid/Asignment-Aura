
// The function that doesn't return value
fun greet(): Unit { println("Good day!") }


// Aura Assignment
fun main() {
    var name = "Madrigal"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal


    val healthStatus: String = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }

    var auraColor = "green"
    println("Enter the karma number: ")
    var karmanum = readLine()!!.toInt()
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()

    when (karmanum) {
        in 0..5 -> auraColor = "red"
        in 6..10 -> auraColor = "orange"
        in 11..15 -> auraColor = "purple"
        in 16..20 -> auraColor = "green"
    }

    println("The karma number is: $karma and the aura color is: $auraColor")
}