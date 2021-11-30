fun main(args: Array<String>) {
    // Declaration = Assignment

    // keyword variableName = value
    // var -> writable
    // val -> read only

    var number = 20
    number = 30

    val pie = 3.14


    /* Data Types
    * Int -> 123
    * Double -> 2.225
    * Float -> 2.28f
    * String -> "Hello World"
    * Char -> 'A'
    * Boolean -> True, False
    * Any -> Int, Double, String.....
    * */

//    var number_two:Any = 20
//    number_two = 20.2

    // keyword variableName: DataType = value
    /** Variables cannot contain
     * 1name ->
     * name!& ->
     * variable name ->
     * Double ->
     * */

    val name: String = "Fouad"
    var age: Int = 16
    var weight: Float = 70.5000f
    var height: Int = 176

    var nickname = name

    print("Hello World ")
    println(name)

    println("My nickname is: " + nickname)
    println("My nickname is: $nickname")

    var triangleA = 50
    var triangleB = 20
    var triangleC = 30

    val result = triangleA + triangleB + triangleC

    println("perimeter of triangle is: $result")

}