
// Real world example
// Consider the case of a hiring manager. It is impossible for one person to interview for each of the positions. Based on the job opening, she has to decide and delegate the interview steps to different people.

// In plain words
// It provides a way to delegate the instantiation to logic classes

// Wikipedia says
// In class-based programming, the factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory method—either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor.


/*
Interviewer interface

askQuestions()
*/

class Developer {
  askQuestions() {
    console.log('Asking about design patterns!')
  }
}

class CommunityExecutive {
  askQuestions() {
    console.log('Asking about community building')
  }
}

class HiringManager {
	takeInterview() {
		const interviewer = this.makeInterviewer();
		interviewer.askQuestions();
	}
}

class DevelopmentManager extends HiringManager {
	makeInterviewer() {
		return new Developer();
	}
}

class MarketingManager extends HiringManager {
	makeInterviewer() {
		return new CommunityExecutive();
	}
}

const devManager = new DevelopmentManager()
devManager.takeInterview() // Output: Asking about design patterns

const marketingManager = new MarketingManager()
marketingManager.takeInterview() // Output: Asking about community building.