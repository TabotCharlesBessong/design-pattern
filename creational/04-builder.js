
// Real world example with builder methods
// Imagine you are at Hardee's and you order a specific deal, lets say, "Big Hardee" and they hand it over to you without any questions this is the example of simple factory. But there are cases when the creation logic might involve more steps. For example you want a customized Subway deal, you have several options in how your burger is made e.g what bread do you want? what types of sauces would you like? What cheese would you want? etc. In such cases builder pattern comes to the rescue.

// In plain words
// Allows you to create different flavors of an object while avoiding constructor pollution. Useful when there could be several flavors of an object. Or when there are a lot of steps involved in creation of an object.

// Wikipedia says
// The builder pattern is an object creation software design pattern with the intentions of finding a solution to the telescoping constructor anti-pattern.

class Burger {
	constructor(builder) {
		this.size = builder.size;
		this.cheeze = builder.cheeze || false;
		this.pepperoni = builder.pepperoni || false;
		this.lettuce = builder.lettuce || false;
		this.tomato = builder.tomato || false;
	}
}

class BurgerBuilder {
	constructor(size) {
		this.size = size;
	}

	addPepperoni() {
		this.pepperoni = true;
		return this;
	}

	addLettuce() {
		this.lettuce = true;
		return this;
	}

	addCheeze() {
		this.cheeze = true;
		return this;
	}

	addTomato() {
		this.tomato = true;
		return this;
	}

	build() {
		return new Burger(this);
	}
}

const burger = (new BurgerBuilder(14)).addCheeze().addLettuce().addPepperoni().addTomato().build()

console.log(burger)

// When to use ?
// When there could be several flavors of an object and to avoid the constructor telescoping. The key difference from the factory pattern is that factory pattern is to be used when the creation is a one step process while builder pattern is to be used when the creation is a multi step process.