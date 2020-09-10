package app.gaz


fun main() {

    // Type Inference:
    //El compilador de Kotlin puede identificar automáticamente el tipo de datos
    // de la variable.

    var cadena = "HOLA"; // Se asigna el typo de inferencia segun el tipo de dato asignado.
    cadena ="mundo"
    // cadena = 555 mraca error por que ya se asigno o se hizo la inferencia como type: String

    val number_2 = 55.5
    // number_2 = 10.6  error por que ya esta asignado es inmutable (o constante o final)


    // declaracion explicita del tipo de valor de la variable:
    var number_1: Int = 10;  // B.P. Asignar correctamente el tipo de Dato.
    number_1 = 11;

    println(number_1)

    val employee1 = Employee("Isa Gaz", 555) // se pueden cambiar en la instancia...pero no se puede reagsinar.

    employee1.name = "Isa Gaz Moroyoui"
    employee1.id = 777

    //employee1 = Employee("Fco Gaz", 666) ==> error: no pude asignarse valores diferentes.

    val employee2 = Employee("Juan Gaz", 9)


    employee2.name = "Julio arias"
    employee2.id = 999

    // se pueden cambiar los valores de las propiedades del empleado...
    // aunque la variable se halla declarado como val(Inmutable).

    var _char = 'C'
    var z: Short = 6
    var x = 123.5F
    var d = 55.5
    var L = 3455555555555555555L

    var e : Long = L
//  var e1 : Long  g --> Error: No puede ser asignada una variable que no es del mismo tipo

   // var tinyNum: Byte = 500 not work

    var g:Int = 6
    var u = g +6
    println("el valor de la suma: $u")


    var number1 = 6;
    println(number1)
    number1 = 5
    println(number1)
    var number2 = 9;

    println("--------------------------")
    println(number1.equals(number2))

    println("----------change test git----------------")

}
class Employee (var name: String, var id: Int) {

}

/*
un val porque pensamos que una vez

a un empleado se le asigna una identificación, esa identificación

nunca cambia en una aplicación del mundo real,

probablemente tengamos nombre

y apellido pero ya sabes, esto es solo

una demostración. Así que ahora volvamos a la principal

función y declararemos un empleado

variable, por lo que diremos val employee1

es igual a empleado y llamemos a este empleado

Lynn Jones y le daremos una identificación de 500.

Hasta ahora todo bien, asumamos que Lynn

se casa y decide llevársela

el nombre del esposo, así que cambiaremos su nombre

entonces diremos employee1.name es igual

Lynn Smith y eso funciona.

No vemos un error como puede ver el nombre

está subrayado porque es mutable

variable, porque la hemos declarado como

var y porque se declara como var,

puedes cambiarlo tantas veces

veces como quieras. Hice esto para mostrarte

que cuando una variable es inmutable

no significa que las propiedades de la instancia sean

inmutable significa que no puedes asignar

otra instancia a la variable, porque

notarás que declaramos empleado1

como val, lo que significa que es inmutable,

pero podemos reasignar las propiedades

en employee1, así que está bien que cambiemos

los valores dentro de una instancia de empleado,

pero si intentáramos asignar

una instancia de empleado diferente a employee1,

eso sería un error. Intentémoslo.

Asignemos una instancia diferente.

Así que intentemos que employee1 sea igual a employee

y lo llamaremos, veamos, Tim Watson

y le daremos un DNI de 100

y verás que ahora tenemos un error,

val no se puede reasignar. Así que de nuevo, está bien

con variables inmutables que contienen un

ejemplo. Está bien cambiar los valores

de las propiedades de la instancia, pero no puede

asignar una instancia completamente diferente,

porque aquí, por supuesto, tienes un

referencia de instancia y la instancia

la referencia no cambia cuando haces esto,

pero cuando estas asignando

una instancia completamente diferente, lo hace

por lo que no está permitido hacer eso con variables val.

Ahora, dije que la regla

para val variables es que estás permitido

para asignarlo una vez, dentro del bloque de

código donde está definido y hay

casos en los que el compilador puede

Garantizar que la variable es solo

va a ser asignado una vez, aunque

puede parecer que está siendo asignado

mas de una vez. Así que deshagámonos de esto

para que podamos deshacernos del error.

Declaremos a otro empleado,

y esta vez no asignaremos un valor inicial

allí mismo y luego declaremos un

variable número2, que solo vamos

para usar en una tonta declaración if,

eso no significa nada solo para

Demuestre que lo que queremos decir con usted puede

asignar una variable una vez en un bloque.

Entonces, escribiremos si número es menor que número2,

cual es. Entonces asignaremos

empleado2 el nombre Jane Smith,

y le daremos a Jane una identificación de 400, de lo contrario

asignar al empleado2 el nombre Mike Watson

y le daremos una identificación de unos 150.

Entonces, aquí no tenemos ningún error

aunque aal es inmutable porque somos

solo asignando a la vez el compilador puede

Garantizar que employee2 solo va

para ser asignado una vez, porque o el

si se ejecutará el código o el código else

se ejecutará, así que esto estaría bien,

ok y es lo mismo con final

variables en Java, pero pensé que

ilustre que lo mismo se aplica en Kotlin.

De acuerdo, el compilador, como hemos visto,

puede inferir el tipo de una variable

a veces, dependiendo del contexto pero

eso no significa que el tipo de

variable puede cambiar como por ejemplo,

no podemos hacer algo como esto.

Eso nos da un error como podemos ver, falta de coincidencia de tipos

cadena int requerida y encontrada.

Entonces no puede cambiar el tipo de datos de una variable

sobre la marcha, me refiero a que el compilador puede

diga aquí que quiere asignar

una cadena, pero el tipo se fija en

tiempo de declaración. Entonces no puedes cambiar

tipos de variables sobre la marcha, aunque

el compilador puede averiguar los tipos,

sin que tengas que contarlo y eso es

para este video. Solo quiero dar

usted una descripción general rápida de la variable.

Te veo en el próximo.

notarás que declaramos empleado1

como val, lo que significa que es inmutable,

pero podemos reasignar las propiedades

en employee1, así que está bien que cambiemos
 */


