
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






