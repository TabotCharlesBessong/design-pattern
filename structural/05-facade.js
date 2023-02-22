
// Real world example
// How do you turn on the computer? "Hit the power button" you say! That is what you believe because you are using a simple interface that computer provides on the outside, internally it has to do a lot of stuff to make it happen. This simple interface to the complex subsystem is a facade.

// In Plain words
// Facade pattern provides a simplified interface to a complex subsystem.

// Wikipedia says
// A facade is an object that provides a simplified interface to a larger body of code, such as a class library.

class Computer {
	getElectricShock() {
		console.log("Ouch!");
	}

	makeSound() {
		console.log("Beep beep!");
	}

	showLoadingScreen() {
		console.log("Loading..");
	}

	bam() {
		console.log("Ready to be used!");
	}

	closeEverything() {
		console.log("Bup bup bup buzzed!");
	}

	sooth() {
		console.log("Zzzzz");
	}

	pullCurrent() {
		console.log("Hamah!");
	}
}

class ComputerFacade {
	constructor(computer) {
		this.computer = computer;
	}

	turnOn() {
		this.computer.getElectricShock();
		this.computer.makeSound();
		this.computer.showLoadingScreen();
		this.computer.bam();
	}

	turnOff() {
		this.computer.closeEverything();
		this.computer.pullCurrent();
		this.computer.sooth();
	}
}

const computer = new ComputerFacade(new Computer())
computer.turnOn() // Ouch! Beep beep! Loading.. Ready to be used!
computer.turnOff() // Bup bup buzzz! Haah! Zzzzz