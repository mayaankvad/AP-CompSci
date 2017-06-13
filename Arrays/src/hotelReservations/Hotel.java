package hotelReservations;

/**
 * Stores reservation objects in an array with room numbers as indexes.
 */

public class Hotel {

	// list[] stores reservations for each room. The index is the room number.
	// All elements are null at the beginning
	private Reservation[] list;

	public Hotel(int numbRooms) {
		this.list = new Reservation[numbRooms];
	}

	// find and return the average room rate of the occupied rooms.
	public double averageRoomRate() {
		double sum = 0;
		for (Reservation r : this.list) {
			if (r != null) {
				sum += r.getRate();
			}
		}
		return sum / this.reservedRoomCount();
	}

	// Displays room numbers and reservation information.
	public void display() {
		System.out.printf("\n%-20s \t %-10s \t %10s \n", "Name", "Rate", "Room #");
		for (int i = 0; i < this.list.length; i++) {
			if (this.list[i] != null) {
				System.out.printf("%-20s \t $%-10s \t %10d \n", this.list[i].getName(),
						Double.toString(this.list[i].getRate()), i);
			}
		}
	}

	// returns true if room is occupied
	public boolean isOccupied(int room) {
		return this.list[room] != null;
	}

	// Find and return number of rooms with a reservation
	public int reservedRoomCount() {
		int rooms = 0;
		for (Reservation r : this.list) {
			if (r != null) {
				rooms++;
			}
		}
		return rooms;
	}

	// Assigns a new Reservation to the first available room.
	// Print out reservation with room number or indicate that hotel is full
	public void reserveRoom(String name, double rate) {
		boolean reserved = false;
		for (int i = 0; i < this.list.length; i++) {
			if (this.list[i] == null) {
				this.list[i] = new Reservation(name, rate);
				System.out.println("Room " + i + " Reserved for " + name + " at $" + rate);
				reserved = true;
				break;
			}
		}
		if (!reserved) {
			System.out.println("Hotel is full ");
		}
	}

	// Assigns a new Reservation to an inputted room.
	// if room is occupied, find the first available room in the array
	// Print out reservation with room number or indicate that hotel is full
	public void reserveRoom(String name, double rate, int room) {
		if (!isOccupied(room)) {
			this.list[room] = new Reservation(name, rate);
			System.out.println("Room " + room + " Reserved for " + name + " at $" + rate);
		} else {
			System.out.print("Room " + room + " is not available :>> ");
			this.reserveRoom(name, rate);
		}
	}

}
