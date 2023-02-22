
// Real world example
// An old radio set will be a good example of iterator, where user could start at some channel and then use next or previous buttons to go through the respective channels. Or take an example of MP3 player or a TV set where you could press the next and previous buttons to go through the consecutive channels or in other words they all provide an interface to iterate through the respective channels, songs or radio stations.

// In plain words
// It presents a way to access the elements of an object without exposing the underlying presentation

// Wikipedia says
// In object-oriented programming, the iterator pattern is a design pattern in which an iterator is used to traverse a container and access the container's elements. The iterator pattern decouples algorithms from containers in some cases, algorithms are necessarily container-specific and thus cannot be decoupled.

class RadioStation {
	constructor(frequency) {
		this.frequency = frequency;
	}

	getFrequency() {
		return this.frequency;
	}
}

class StationList {
	constructor() {
		this.stations = [];
	}

	addStation(station) {
		this.stations.push(station);
	}

	removeStation(toRemove) {
		const toRemoveFrequency = toRemove.getFrequency();
		this.stations = this.stations.filter((station) => {
			return station.getFrequency() !== toRemoveFrequency;
		});
	}
}

const stationList = new StationList()

stationList.addStation(new RadioStation(89))
stationList.addStation(new RadioStation(101))
stationList.addStation(new RadioStation(102))
stationList.addStation(new RadioStation(103.2))

stationList.stations.forEach(station => console.log(station.getFrequency()))

stationList.removeStation(new RadioStation(89)) // Will remove station 89