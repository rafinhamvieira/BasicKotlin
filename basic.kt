/**
 * @autho
 */

/*
tipos de dados

val hello:String = "olá //String
val one = 1 // Int
Double and Float
val pi = 3.14 // Double
arrayOf(1,2,3) //array (com parenteses)
IntArrayOf(1,2,3)
listOf(1,2,3) //list com colchetes[]

conversão
toByte(): Byte
toShort(): Short
toInt(): Int
toLong(): Long
toFloat(): Float
toDouble(): Double
toChar(): Char

var (valor mutavel, CamelCase)

val (valor imutavel, CamelCase) similiar ao final em java

const val (valor imutavel, SNAKE_CASE) tem que ser declarada fora da função main

val name1 = "rafael" //não pode ser alterado depois
var greeting: String? = null
fun main() {
    greeting = "olá"
    if (greeting != null){
        println(name1)
        println(greeting)
    } else {
        println(name1)
        println("hi")
    }
}

val name1 = "rafael"
var greeting: String? = "olá"
fun main() {
    when(greeting){
        null -> println("hi")
        else -> println(greeting)
    }
}



val myName = "rafael"
var greeting: String? = null
fun main() {
    //val greetingToPrint = if(greeting != null) greeting else "olá"
    val greetingToPrint = when(greeting){
        null -> "HI"
        else -> greeting
    }
    println(greetingToPrint)
    println(myName)
}

fun sayHello() {
    println(getGreeting())
}

fun getGreeting() = "hello world" //função de expressao unica
fun main() {
    println(getGreeting)
    sayHello()
}


fun main() {
    val aChar: Char = 'a'
    println(aChar)
    println(getGreeting())
}
fun getGreeting() = "hello world"


fun sayHello(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")

fun main() {
    sayHello(greeting = "olá ", itemToGreet = "Rafael")
}
*/

fun sayHello(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")
fun main() {
    /*val coisasInteressantes2= arrayOf("kotlin", "programacao", "comicbooks")
    println(coisasInteressantes2)
    println(coisasInteressantes.size)
    println(coisasInteressantes[0])
    println(coisasInteressantes.get(0))


    for (coisa in coisasInteressantes){
        println(coisa)
    }
    coisasInteressantes.forEach {coisa -> //se deixar sem nada
    println(coisa) // é o nome padrao para foreach
    
    coisasInteressantes.forEachIndexed { index, coisa ->
        println("$coisa is at index $index") //mostra o index
    }
    val coisasInteressantes = mutableListOf("kotlin", "programacao", "comicbooks") //adicionar mutable para poder adicionar ou remover elementos
    coisasInteressantes.add("cachorro")
    println(coisasInteressantes)
    coisasInteressantes.forEachIndexed{ index, coisa ->
        println("$coisa $index")
    }
    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c") //valor e chave
    map[4] = "d"
    map.forEach{ (key, value) -> println("$key -> $value")} //para mostrar valores e as chaves
     */
    val Person1 = Person(firstName = "olá", lastName = " tchau")
    println(Person1.firstName)
    Person1.lastName
    println("Hello World")
}