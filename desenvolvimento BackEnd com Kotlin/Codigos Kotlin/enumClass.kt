enum class State {
    IDLE, RUNNING, FINISHED                           // 1 estados declarados dentro da classe enum
}

fun main() {
    val state = State.RUNNING                         // 2 definir um dos enums para um estrtura criada, cases
    val message = when (state) {                      // 3 denfinir classes, 
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)
}

// ____________________________________________________________________________________________________________

enum class Color(val rgb: Int) {                      // 1 uma enum class com contrutor que recebe uma rgb
    RED(0xFF0000),                                    // 2 adicionando os rgbs pleo construtor
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)  // 3 Enum class members are separated from the constant definitions by a semicolon.
}

fun main() {
    val red = Color.RED
    println(red)                                      // 4 retorna a constante red
    println(red.containsRed())                        // 5 chama uma red pelo metodo, que ira retornar true or false.
    println(Color.BLUE.containsRed())                 // 6 false
    println(Color.YELLOW.containsRed())               // 7 false
}
