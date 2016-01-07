// Arrays
// Arrays in Swift assume the type based on what we put in the Array
//var todo = ["Finish Collections course", "Buy groceries", "Respond to emails"]

//but can also do explicit:
//this Array is a var, so we can change it later/add to it
var todo: [String] = ["Finish collections course", "Buy groceries", "Respond to emails"]

//to add a new item to the todo Array, append is a Swift method
todo.append("Pick up dry cleaning")

//adding another Array to todo
todo += ["Order book online"]

// An Array that is a constant, ie, immutable
let secondTaskList = ["Mow the lawn"]

//Get an error, we can't add items to an Array that is a constant
//secondTaskList.append("Derp")


// Reading from Arrays

//This assigned the first item in the todo Array, to firstTask
let firstTask = todo[0]

let thirdTask = todo[2] //third item in the Array

// Modifying items in an Array

todo[4] = "Brush teeth"

// Inserting into an Array using Indexes, specifiying what Index to place it

todo.insert("Pay bills", atIndex: 2)

// Removing items from an Array

todo.removeAtIndex(3)

todo //respond to emails is now gone from the todo Array

todo.count //returns the number of items in the Array


