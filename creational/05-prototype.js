
// Real world example
// Remember dolly? The sheep that was cloned! Lets not get into the details but the key point here is that it is all about cloning

// In plain words
// Create objects based on an existing object through cloning

// Wikipedia says
// The prototype pattern is a creational design pattern in software development. It is used when the type of objects to create is determined by a prototypical instance, which is cloned to produce new objects.

// In short, it allows you to create a copy of an existing object and modify it to your needs, instead of going through the trouble of creating an object from scratch and setting it up.

class Sheep {
	constructor(name, category = "Mountain Sheep") {
		this.name = name;
		this.category = category;
	}

	setName(name) {
		this.name = name;
	}

	getName() {
		console.log(this.name);
	}

	setCategory(category) {
		this.category = category;
	}

	getCategory() {
		console.log(this.category);
	}
}

class SheepPrototype {
	constructor(proto) {
		this.proto = proto;
	}

	clone() {
		return new Sheep(this.proto.name, this.proto.category);
	}
}

const originalSheep = new Sheep("Jolly");
originalSheep.getName(); // Jolly
originalSheep.getCategory(); // Mountain Sheep

// Clone and modify what is required
const prototype = new SheepPrototype(originalSheep);
const clonedSheep = prototype.clone();
clonedSheep.setName("Dolly");
clonedSheep.getName(); // Dolly
clonedSheep.getCategory(); // Mountain sheep

// When to use 
// When an object is required that is similar to existing object or when the creation would be expensive as compared to cloning.