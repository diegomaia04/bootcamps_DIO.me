fun main() {
   val a = 10
   val b = 0

   try {
    val divisao = a/b
    println(divisao)
} catch (e: Throwable) {
    println("impossivel dividir por zero")
} finally {
       println("bloco de teste trycatch")
   }
}   

// outra maneira que podemos escrever um codigo parecido com o de cima, com a mesma finalidade

fun main() {
   val a = 10
   val b = 0
  
   val divisao = try {a/b} catch (e: ArithmeticException) {0}
   println(divisao)
}
  
