fun main() {
    cases("Hello")   // *
    cases(1)         // *
    cases(0L)        // *
    cases(MyClass()) // *
    cases("hello")   // * nessas linhas que eu comentei esat ssendo declarada a variavel ANY, que sera usada abaixo
}

fun cases(obj: Any) {                                
    when (obj) {                                     
        1 -> println("One")                          // 1 caso o obj for igual a 1, ele retornara o "One"
        "Hello" -> println("Greeting")              // 2 caso o obj for igual a "Hello", ele retornara "Greeting"
        is Long -> println("Long")                 // 3   caso o obj for igual do tipo Long, ele retornara "Long"
        !is String -> println("Not a string")     // 4   caso o obj nao for uma string ("! = negação"), retonara "not a string"  
        else -> println("Unknown")               // 5 c
    }   
}

class MyClass
