// heranca padrao.

open class Dog {                // 1 classe mae
    open fun sayHello() {       // 2 função criada na classe mar para ser reaproveitada
        println("wow wow!")
    }
}

class Yorkshire : Dog() {       // 3 classe Yorkshire deriva da classe DOG, sintaxe para isso
    override fun sayHello() {   // 4 função herdada da classe dog e reescrita.
        println("wif wif!")
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
    
}

// heranca com parametro de cosntrutor

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")                  // 1 herdar uma clsse passando um parametro no construtor

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}

// herança propagar um elemnto ja recebido na classe filha

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India") // 1 aqui recebmos como herança a classe Lion, recebendo apenas a "origin

fun main() {
    val lion: Lion = Asiatic("Rufo")                              // 2 nessa linhas definimos o nome
    lion.sayHello()
}
