// funções de escopo
// funçaõ let

fun customPrint(s: String) {
    print(s.uppercase())
}

fun main() {

    val empty = "test".let {               // 1
        customPrint(it)                    // 2
        it.isEmpty()                       // 3
    }
    println(" is empty: $empty")


    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let {                         // 4
            print("\t")
            customPrint(it)
            println()
        }
    }
    
    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        strOne?.let { firstString ->       // 5 
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }
    
    printNonNull(null)
    printNonNull("my string") 
    printIfBothNonNull("First","Second") 

}

// _________________________________________________________________________________________________________________________________________________
// função run

fun main() {

    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        ns?.run {                                                  // 1
            println("\tis empty? " + isEmpty())                    // 2
            println("\tlength = $length")                           
            length                                                 // 3
        }
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")

}
// _________________________________________________________________________________________________________________________________________________
// função with

class Configuration(var host: String, var port: Int) 

fun main() {
    val configuration = Configuration(host = "127.0.0.1", port = 9000) 


    with(configuration) {
        println("$host:$port")
    }

    // instead of:
    println("${configuration.host}:${configuration.port}")    

}
// _________________________________________________________________________________________________________________________________________________
// função apply
data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun main() {

    val jake = Person()                                     // 1
    val stringDescription = jake.apply {                    // 2
        name = "Jake"                                       // 3
        age = 30
        about = "Android developer"
    }.toString()                                            // 4

    println(stringDescription)
}
// _________________________________________________________________________________________________________________________________________________
// funçaõ also

data class Person(var name: String, var age: Int, var about: String) {
             constructor() : this("", 0, "")
}
         
fun writeCreationLog(p: Person) {
    println("A new person ${p.name} was created.")              
}
         
fun main() {

    val jake = Person("Jake", 30, "Android developer")   // 1
        .also {                                          // 2 
            writeCreationLog(it)                         // 3
    }

}
