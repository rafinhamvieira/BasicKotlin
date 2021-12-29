/*
qualquer tipo pode ser nulo porem isso deve ser explicitado na declaração da variavel atraves do (?)
var month:Int? = null
 */

fun main() {
    var a:Int = 1
    var b:Int = 2

    var c:Int = a.plus(b)
    println(c)
}

//elvis operator

var number = a?: b?: 0
	     se a for true ele atribui number igual a A e caso os dois forem falsos o 0 é atribuido
