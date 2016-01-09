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

// Dealing with non-existent data

// gives an error, there is nothing at index 5
//let lastItem = todo[5]


///////// Dictionaries ie hash maps in Java//////////
// Does not preserve the order you added them
//Don't use a dictionary if order matters

/* 

Airpport Code                Airport Name
(Key)                       (Value)
(LGA)                       (La Guardia)
(CDG)                       (Charles De Gaulle)
(HKG)                       (Hong Kong)


*/
// Key: value
//: [String: String] is not necessary
//hold option key, and then click on a variable name to see info about it
var airportCodes: [String: String] = ["LGA": "La Guardia",
    "CDG": "Charles De Gaulle",
    "HKG": "Hong Kong"
]

// Read from a dictionary

// pass in the key for the value you want...case matters
airportCodes ["LGA"]

// Inserting Key Value Pairs into an exiting Dictionary

//tell it the key you want for it, followed by that keys value
airportCodes ["SYD"] = "Sydney Airport"

airportCodes //now shows the new key and value we added above

// Since LGA key already exists, this changes the value to "Derp"
airportCodes ["LGA"] = "Derp"

airportCodes

// Method to update a key, or if it doesn't exist, creates new one
airportCodes.updateValue("Dublin Airport", forKey: "DUB")

// Removing Key Value Pairs

// assigning nil, tells swift we want the value of HGK to be nothing, and it removes it
airportCodes["HGK"] = nil

//swift method that removes a key and its value
airportCodes.removeValueForKey("DUB")


// Dealing with non-existing data

let airporName = airportCodes["LGA"]
airporName.dynamicType // Shhows that it is an Optional String

//assigns value of nil, because we don't have this key in the dictionary
let orlandoAirport = airportCodes["MCO"]









