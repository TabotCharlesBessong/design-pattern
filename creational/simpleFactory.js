/*
Door

getWidth()
getHeight()

*/

// Real world example 

// Consider, you are building a house and you need doors. It would be a mess if every time you need a door, you put on your carpenter clothes and start making a door in your house. Instead you get it made from a factory.

// In plain words
// Simple factory simply generates an instance for client without exposing any instantiation logic to the client

// wikipedia says 
// In object-oriented programming (OOP), a factory is an object for creating other objects – formally a factory is a function or method that returns objects of a varying prototype or class from some method call, which is assumed to be "new".

class WoodenDoor {
	constructor(width, height) {
		this.width = width;
		this.height = height;
	}

	getWidth() {
		return this.width;
	}

	getHeight() {
		return this.height;
	}
}


const DoorFactory = {
	makeDoor: (width, height) => new WoodenDoor(width, height),
};

const door = DoorFactory.makeDoor(100, 200);
console.log("Width:", door.getWidth());
console.log("Height:", door.getHeight());

// When to Use
// When creating an object is not just a few assignments and involves some logic, it makes sense to put it in a dedicated factory instead of repeating the same code everywhere.