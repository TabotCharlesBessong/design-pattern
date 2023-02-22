// Real world example
// Imagine you run a car service shop offering multiple services. Now how do you calculate the bill to be charged? You pick one service and dynamically keep adding to it the prices for the provided services till you get the final cost. Here each type of service is a decorator.

// In plain words
// Decorator pattern lets you dynamically change the behavior of an object at run time by wrapping them in an object of a decorator class.

// Wikipedia says
// In object-oriented programming, the decorator pattern is a design pattern that allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. The decorator pattern is often useful for adhering to the Single Responsibility Principle, as it allows functionality to be divided between classes with unique areas of concern.

/*
Coffee interface:
getCost()
getDescription()
*/

class SimpleCoffee {
	getCost() {
		return 10;
	}

	getDescription() {
		return "Simple coffee";
	}
}

class MilkCoffee {
	constructor(coffee) {
		this.coffee = coffee;
	}

	getCost() {
		return this.coffee.getCost() + 2;
	}

	getDescription() {
		return `${this.coffee.getDescription()}, with milk`;
	}
}

class WhipCoffee {
	constructor(coffee) {
		this.coffee = coffee;
	}

	getCost() {
		return this.coffee.getCost() + 5;
	}

	getDescription() {
		return `${this.coffee.getDescription()}, with whip`;
	}
}

class VanillaCoffee {
	constructor(coffee) {
		this.coffee = coffee;
	}

	getCost() {
		return this.coffee.getCost() + 3;
	}

	getDescription() {
		return `${this.coffee.getDescription()}, with vanilla`;
	}
}


let someCoffee

someCoffee = new SimpleCoffee()
console.log(someCoffee.getCost())// 10
console.log(someCoffee.getDescription())// Simple Coffee

someCoffee = new MilkCoffee(someCoffee)
console.log(someCoffee.getCost())// 12
console.log(someCoffee.getDescription())// Simple Coffee, milk

someCoffee = new WhipCoffee(someCoffee)
console.log(someCoffee.getCost())// 17
console.log(someCoffee.getDescription())// Simple Coffee, milk, whip

someCoffee = new VanillaCoffee(someCoffee)
console.log(someCoffee.getCost())// 20
console.log(someCoffee.getDescription())// Simple Coffee, milk, whip, vanilla