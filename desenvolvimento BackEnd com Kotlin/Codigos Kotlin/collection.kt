/*
alguns exemplos de codigos de coleções no kotlin
arquivo mantido apenas para guadar os codigos estudados e com anotalçoes sobre sua funcionalidade.
*/

// list

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // 1 a variavel é imutavel, porem a lista é mutavel, nao tem probelma isso acontecer
val sudoers: List<Int> = systemUsers                              // 2 tanto a lista como a variavel é imutavel

fun addSystemUser(newUser: Int) {                                 // 3 função para adiocnaar elemntos na lista mutavel
    systemUsers.add(newUser)                      
}

fun getSysSudoers(): List<Int> {                                  // 4 função para retornar a lista imutavel
    return sudoers
}

fun main() {
    addSystemUser(4)                                              // 5 acresenta o valor "4" na lista mutavel
    println("Tot sudoers: ${getSysSudoers().size}")               // 6 printa os valores da lista imutavel e mosta se foi adiconado algum valor
    getSysSudoers().forEach {                                     // 7 printa a lista.
        i -> println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Error!                           // 8 erro por tentar adiconar algo a uma lista imutavel
}

// ______________________________________________________________________________________________________________________________________________________

// set

val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3") // 1

fun addIssue(uniqueDesc: String): Boolean {                                                       
    return openIssues.add(uniqueDesc)                                                             // 2
}

fun getStatusLog(isAdded: Boolean): String {                                                       
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."          // 3
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2" 

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")                              // 4
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")                // 5 
}

//_________________________________________________________________________________________________________________________________________________________

// Map

const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)   // 1
val EZPassReport: Map<Int, Int> = EZPassAccounts                                        // 2

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {                                        // 3
        println("Updating $accountId...")                                               
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS  // 4
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    } 
}

fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach {                                                              // 5
        k, v -> println("ID $k: credit $v")
    }
}

fun main() {
    accountsReport()                                                                    // 6
    updatePointsCredit(1)                                                               // 7
    updatePointsCredit(1)                                                               
    updatePointsCredit(5)                                                               // 8 
    accountsReport()                                                                    // 9
}
