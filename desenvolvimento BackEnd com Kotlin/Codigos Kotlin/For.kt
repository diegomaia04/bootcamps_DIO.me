// os exemplos serao dividos em blocos de codigos sperados por linhas, nao tente executar o codigo do jeito que esta, vai dar erro
// caso queira executar, coipie o bloc de codigo desejado e cole em sua platarofma de desenvolvimento.

// exemplo for

fun main() {

    val cakes = listOf("carrot", "cheese", "chocolate") // 1 cirando uma lista
    
    for (cake in cakes) {                               // 2 atribui cada string da lista cakes, em cake e imprimi para cada um dos
        println("Yummy, it's a $cake cake!")            // elementos
    }
}

// _____________________________________________________________________________________________________________________________________________________

// exeplo while and do-while

fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

fun main(args: Array<String>) {
    var cakesEaten = 0
    var cakesBaked = 0
    
    while (cakesEaten < 5) {                    // 1 verifica a condição de reptição do while
        eatACake()
        cakesEaten ++                           // adiciona uma unidade a variavel para cada repetição
    }
    
    do {                                        // 2 faz a mesma coisa enquanto a conidção do while for verdadeiro
        bakeACake()                             // esse condição sempre é depois do while.
        cakesBaked++
    } while (cakesBaked < cakesEaten)           // verifica a quantidade de bolos feitos a bolos comidos e "encerra" o loop

}
// _______________________________________________________________________________________________________________________________________________________

// exemplo iterator

class Animal(val name: String) // propriedade inmutavel do tipo string, que é obrigação declrar

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {             // 1 cria dentro da classe zoo uma interação, fazer um laço de repeticao dentro da classe que criamos
        return animals.iterator()                           // 2 iterator, que permite a lista ser iterada
    }
}

fun main() {

    val animals = listOf(Animal("zebra"), Animal("lion"))
    val zoo = Zoo(animals)

    for (animal in zoo) {                                   // 3 percorre a lista, graças ao iterator que faz uma ponte de ligação
        println("Watch out, it's a ${animal.name}")
    }

}

// ___________________________________________________________________________________________________________________________________________________________
