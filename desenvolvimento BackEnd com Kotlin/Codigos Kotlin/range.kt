fun main() {

    for(i in 0..3) {             // 1 "".." percorre o numeros de 0 ate 3, ver no run
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {        // 2 percorre o numeros de 0 ate chegar 3, onde o tres nao e exibido, se fosse 10, iria te 9
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {      // 3 percorre os nuemros entre 2 e 8, porem pulando duas casas, assim peganno dos numeros pares
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {      // 4 percorre de ordem descresente de 3 ate 0
        print(i)
    }
    print(" ")
    
    for (c in 'a'..'d') {        // 1 faz o mesmo que o range de numeros, passando por letras, porem funciona com string too
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) { // 2 ordem descresente
        print(c)
    }
    print(" ")
val x = 2
if (x in 1..5) {            // 1
    print("x is in range from 1 to 5")
}
println()

if (x !in 6..10) {          // 2
    print("x is not in range from 6 to 10")
}
}
