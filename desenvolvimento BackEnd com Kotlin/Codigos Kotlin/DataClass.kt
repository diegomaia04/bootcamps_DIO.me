data class User(val name: String, val id: Int) {           // 1 declaramos a data class, passando dois valores name and id
    override fun equals(other: Any?) =
        other is User && other.id == this.id               // 2 sobreescrevendo o equals para verificar o id se não guais
}
fun main() {
    val user = User("Alex", 1)
    println(user)                                          // 3 criação do primeiro usuario

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")   // 4 verifica se as ids criadas são iguais, nos novos usuarios criados
    println("user == thirdUser: ${user == thirdUser}")

    // hashCode() function
    println(user.hashCode())                               // 5 valor numeirco que presenta a estrutura de classe que obtemos
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    println(user.copy())                                   // 6 cirando uma referencia de memoria, uma nova innstanica com a mesma estrtura do pierimeiro
    println(user === user.copy())                          // 7 false, por ser uma copia, diferente endereço de memoria
    println(user.copy("Max"))                              // 8 copiar a partir do nome, 
    println(user.copy(id = 3))                             // 9 copiar especificando o id 3

    println("name = ${user.component1()}")                 // 10
    println("id = ${user.component2()}")
}
