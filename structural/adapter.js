// Real world example
// Consider that you have some pictures in your memory card and you need to transfer them to your computer. In order to transfer them you need some kind of adapter that is compatible with your computer ports so that you can attach memory card to your computer. In this case card reader is an adapter. Another example would be the famous power adapter a three legged plug can't be connected to a two pronged outlet, it needs to use a power adapter that makes it compatible with the two pronged outlet. Yet another example would be a translator translating words spoken by one person to another

// In plain words
// Adapter pattern lets you wrap an otherwise incompatible object in an adapter to make it compatible with another class.

// Wikipedia says
// In software engineering, the adapter pattern is a software design pattern that allows the interface of an existing class to be used as another interface. It is often used to make existing classes work with others without modifying their source code.

/*
Lion interface :

roar()
*/

class AfricanLion {
	roar() {
		console.log("I am an African Lion");
	}
}

class AsianLion {
	roar() {
		console.log("I am an Asian Lion");
	}
}

class Hunter {
	hunt(lion) {
		// ... some code before
		console.log(
			"I am hunter and I don't care \n Weather you are an African Lion or anything"
		);
		lion.roar();
		//... some code after
		console.log("I am a lion , no race specific");
	}
}

// This needs to be added to the game
class WildDog {
	bark() {
    console.log("I am a dog and I am wild")
  }
}

// Adapter around wild dog to make it compatible with our game
class WildDogAdapter {
	constructor(dog) {
		this.dog = dog;
	}

	roar() {
		this.dog.bark();
	}
}

let wildDog = new WildDog();
let wildDogAdapter = new WildDogAdapter(wildDog);

let hunter = new Hunter();
hunter.hunt(wildDogAdapter);
