
var todo: [String] = ["Finish collections course",
        "Buy groceries",
        "Respond to emails",
        "Pick up Dry cleaning",
        "Order book online",
        "Mow lawn"]

//prints everything in the todo Array
for x in todo {
    print(x)
}

// Range Operators

//goes from 1 to 10 including 10
for number in 1...10 {
    print("\(number) times 5 is equal to \(number * 5)")
}




////While Loop///////
var x = 0

while x <= 20 {
    print(x)
    x++
}

var index = 0

while index < todo.count {
   //so the first time, it prints the first item, 0, in the todo array
    print(todo[index])
    index++
}



// Repeat While

var counter = 1

while counter < 1 {
    print("I'm inside  the while loop")
    counter++
}

repeat {
    print("I'm inside the repeat loop")
    counter++
} while counter < 1

//// If Statement/////



var temperature = 9

if temperature < 12 {
    print("Better wear a coat!")
} else if temperature < 18 {
    print("It is getting chilly")
}
else {
    print("It is warm")
}


//// Logical Operators /////

if temperature > 7 && temperature < 12 {
    print("Might want to wear a scarf with that jacket")
}

var isRaining: Bool = true
var isSnowing: Bool = false

if isRaining || isSnowing {
    print("Better wear boots")
}

if !isRaining {
    print("Yay it isn't raining")
}

if isRaining && isSnowing && temperature < 2 {
    print("Put some gloves on!")
}

//// Switch Statements /////


let airportCodes = ["LGA", "LHR", "CDG", "HKG", "DXB", "LGW", "JFK", "ORY"]

//convention to name it the singular of the array you are iterating through
for airportCode in airportCodes {
    switch airportCode {
    case "LGA", "JFK": print("New York")
    case "LHR", "LGW": print("London")
    case "CDG", "ORY": print("Paris")
    case "HKG": print("Hong Kong")
    default: print("I don't know what city this airport is in")
    }
}

import Foundation

var randomTemperature = Int(arc4random_uniform(UInt32(150)))

switch randomTemperature {
case 0..<32: print("Forget it, stay inside")
case 32...45: print("Wear a jacket")
case 45..<70: print("A little chilly")
case 70...100: print("It is hot out")
default: print("It is really hot dude")
}


























