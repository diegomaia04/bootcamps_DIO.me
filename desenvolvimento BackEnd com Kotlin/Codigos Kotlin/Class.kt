class Customer                                  // 1

class Contact(val id: Int, var email: String)   // 2 nessa linha criamos a classe e declaranos usa estrutura

fun main() {

    val customer = Customer()                   // 3 nessa linha instaciamos a classe criada no main
    
    val contact = Contact(1, "mary@gmail.com")  // 4 criando um objeto a aaprti do contrutor da classe

    println(contact.id)                         // 5 imprimindo as informações da classe
    contact.email = "jane@gmail.com"            // 6 ""
}
