fun main() {

    var a: String = "initial"  // 1
    println(a)
    a = "final"
    println(a)
    val b: Int = 1             // 2
     println(b) 
    val c = 3                  // 3
    println(c)                 
    
    
    // variavel nao declara, portanto o codigo não funcionará
    var e: Int  // 1
    println(e)  // 2
    
    val d: Int  // 1

    if (someCondition()) {
       d = 1   // 2
    } else {
       d = 2   // 2
    }

println(d) // 3

}
