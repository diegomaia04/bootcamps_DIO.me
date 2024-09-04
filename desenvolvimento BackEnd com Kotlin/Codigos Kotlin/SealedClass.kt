sealed class Mammal(val name: String)                                                   // 1 criaçã da classe selada

class Cat(val catName: String) : Mammal(catName)                                        // 2 acesso a classe, e possivel enxegar a classe selada, porem pode enxeguar pq todas as classes estao no mesmo pacote
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {                                                                     // 3 verifica se é a classe cat ou human
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"    // 4 retorna os atributos do human caso se for humano name
        is Cat -> return "Hello ${mammal.name}"                                         // 5 retorna os atributos do cat
    }                                                                                   // 6 o "else' não é necessario
}

fun main() {
    println(greetMammal(Cat("Snowy")))
}
