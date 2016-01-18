// Swift Functions

// length: Int, is giving the function a parameter called length, of type Int
// same for width
// -> specifies a return type

//commented out, function without return type
//func calculateArea(length: Int, width: Int) -> Int {
    //length and width here, named same as parameters
    //let area = length * width
    
    //print(area)
//}

// By specifying a return type, allows Swift to check for errors better
// -> specifies a return type
func calculateArea(length: Int, width: Int) -> Int {
    //length and width here, named same as parameters
    let area = length * width
    //versus doing a print
    //gives better results
    return area
}

// Calling the above function
//The numbers we are passing is, is what the length and width values will be set to
//can call the fucnction as many times as we want

calculateArea(12, width: 15)

//using a return in a function, allows you to assign a value
let areaRoom1 = calculateArea(15, width: 22)


// Tells the compiler no return type, can also use a set of empty () instead of Void
func someFunction() -> Void {
    
}



func stringFunction(firstName: String, lastName: String ) -> String {
    let fullName = firstName + " " + lastName
    return fullName
}

stringFunction("Adam", lastName: "Carter")


func concatenateString(a: String, b: String) -> String {
    return a + b
}

concatenateString("A", b: "B")


// Another way of naming parameters
func sayHello(to person: String, and anotherPerson: String) -> String {
   
    return "Hello \(person) and \(anotherPerson)"
}

sayHello(to: "Adam", and: "Joe")




// Default Values with functions
//the = "tan" gives that param a default value

func carpetCostCalculator(length length: Int, width: Int, carpetColor: String = "tan") -> (price: Int, carpetColor: String) {
    // Gray carpet - $1/sq ft
    // Tan is $2/sq ft
    // Deep blue is $4/sq ft
    
    //calling another function we made, inside this function
    let area = calculateArea(length, width: width)
    
    var price: Int
    
    switch carpetColor {
        case "gray": price = area * 1
        case "tan": price = area * 2
        case "blue": price = area * 4
        default: price = 0
    }
    
    return (price, carpetColor)
    
}
//with a defauly value in the parameters, we now get 2 options when we call the function
//the first one, assumes the default value of tan for the carpetColor parameter
let result = carpetCostCalculator(length: 10, width: 20)
carpetCostCalculator(length: 10, width: 12, carpetColor: "blue")

result.price
result.carpetColor


// Function Scope

// a parameter is consider a constant unless you specify var, as below
func countDownAndUp(var a: Int) {
    var b = a
    
    while b >= 0 {
        b--
        a++
        print("a: \(a)")
        print("b: \(b)")
    }
}

var a = 20

countDownAndUp(a)

a








