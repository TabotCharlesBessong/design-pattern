
// Real world example with abstract factory methods
// Extending our door example from Simple Factory. Based on your needs you might get a wooden door from a wooden door shop, iron door from an iron shop or a PVC door from the relevant shop. Plus you might need a guy with different kind of specialities to fit the door, for example a carpenter for wooden door, welder for iron door etc. As you can see there is a dependency between the doors now, wooden door needs carpenter, iron door needs a welder etc.

// In plain words
// A factory of factories a factory that groups the individual but related/dependent factories together without specifying their concrete classes

// Wikipedia says
// The abstract factory pattern provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes

/*
Door interface :

getDescription()
*/

class WoodenDoor {
    getDescription() {
        console.log('I am a wooden door')
    }
}

class IronDoor {
    getDescription() {
        console.log('I am an iron door')
    }
}

/*
DoorFittingExpert interface :

getDescription()
*/

class Welder {
    getDescription() {
        console.log('I can only fit iron doors')
    }
}

class Carpenter {
    getDescription() {
        console.log('I can only fit wooden doors')
    }
}

// Now we have our abstract factory that would let us make family of related objects i.e. wooden door factory would create a wooden door and wooden door fitting expert and iron door factory would create an iron door and iron door fitting expert


/*
DoorFactory interface :

makeDoor()
makeFittingExpert()
*/

// Wooden factory to return carpenter and wooden door
class WoodenDoorFactory {
    makeDoor(){
        return new WoodenDoor()
    }

    makeFittingExpert() {
        return new Carpenter()
    }
}

// Iron door factory to get iron door and the relevant fitting expert
class IronDoorFactory {
    makeDoor(){
        return new IronDoor()
    }

    makeFittingExpert() {
        return new Welder()
    }
}

let woodenFactory = new WoodenDoorFactory()

let door = woodenFactory.makeDoor()
let expert = woodenFactory.makeFittingExpert()

door.getDescription()  // Output: I am a wooden door
expert.getDescription() // Output: I can only fit wooden doors

// Same for Iron Factory
ironFactory = new IronDoorFactory()

door = ironFactory.makeDoor()
expert = ironFactory.makeFittingExpert()

door.getDescription()  // Output: I am an iron door
expert.getDescription() // Output: I can only fit iron doors

// As you can see the wooden door factory has encapsulated the carpenter and the wooden door also iron door factory has encapsulated the iron door and welder. And thus it had helped us make sure that for each of the created door, we do not get a wrong fitting expert.

// When to use 
// When there are interrelated dependencies with not-that-simple creation logic involved