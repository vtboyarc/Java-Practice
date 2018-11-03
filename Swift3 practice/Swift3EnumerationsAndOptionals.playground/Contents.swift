//: Playground - noun: a place where people can play

import UIKit

var str = "Hello, playground"

let week = ["Sunday", "Monday"]
week[1]


//allows us to make a finite Data Set
//helps avoid errors, ie if in the dayType function below typing something wrong
//enums have to start uppercase
enum Day {
    case monday
    case tuesday
    case wednesday
    case thursday
    case friday
    case saturday
    case sunday
}

enum DayType {
    case weekday
    case weekend
}

//func dayType(for day: Day) -> DayType {
    //as long as we have all the cases from the enum, we don't need a default
   // switch day {
   // case Day.saturday, Day.sunday: return DayType.weekend
   // case Day.monday, Day.tuesday, Day.wednesday, Day.thursday,
       //  Day.friday: return DayType.weekday
    //}
//}

    //same as above, but we can take out Day and DayType everywhere, since we specify it in the function, Swift infers it
    //the return type in the function is set to DayType, so when we do return .weekend, it knows it is returning from DayType
    func dayType(for day: Day) -> DayType {
        switch day {
        case .saturday, .sunday: return .weekend
            //can make it even shorter than the one above, if it isn't weekend, then has to be the weekday, so don't need to list them all out
        default: return .weekday
        }
    }

func isNotificationMuted(on type: DayType) -> Bool {
    switch type {
    case .weekend: return true
    case .weekday: return false
    }
}


