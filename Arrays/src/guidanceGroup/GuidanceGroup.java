package guidanceGroup;

public class GuidanceGroup {

	private SatStudent[] group;

	public GuidanceGroup() {
		group = new SatStudent[12];
		group[0] = (new SatStudent("Ye", 640, 695, 686));
		group[1] = (new SatStudent("Bradley", 778, 768, 780));
		group[2] = (new SatStudent("Chen", 687, 614, 705));
		group[3] = (new SatStudent("Davis", 620, 534, 556));
		group[4] = (new SatStudent("Aarons", 550, 565, 517));
		group[5] = (new SatStudent("Gupta", 687, 720, 640));
		group[6] = (new SatStudent("Park", 722, 721, 745));
		group[7] = (new SatStudent("Kohl", 595, 605, 615));
		group[8] = (new SatStudent("Mehta", 525, 637, 521));
		group[9] = (new SatStudent("Bahl", 611, 607, 610));
		group[10] = (new SatStudent("Smith", 670, 703, 610));
		group[11] = (new SatStudent("Issacs", 670, 690, 710));
	}

	public GuidanceGroup(SatStudent[] group) {
		this.group = group;
	}

	public void above2000List() {
		for (SatStudent s : this.group) {
			if (s.grade >= 2000) {
				System.out.println(s.name);
			}
		}
	}

	public void addStudent(SatStudent add) {
		SatStudent[] temp = new SatStudent[this.group.length + 1];
		for (int i = 0; i < this.group.length; i++) {
			temp[i] = this.group[i];
		}
		temp[temp.length - 1] = add;
		this.group = temp;
	}

	public double average() {
		int sum = 0;
		for (SatStudent s : this.group) {
			sum += s.grade;
		}
		return sum / (double) this.group.length;
	}

	public void below1700List() {
		for (SatStudent s : this.group) {
			if (s.grade <= 1700) {
				System.out.println(s.name);
			}
		}
	}

	public GuidanceGroup combineGroups(GuidanceGroup other) {
		SatStudent[] combined = new SatStudent[this.group.length + other.group.length];
		for (int i = 0; i < this.group.length; i++) {
			combined[i] = this.group[i];
		}
		for (int i = this.group.length; i < combined.length; i++) {
			combined[i] = other.group[i - this.group.length];
		}
		return new GuidanceGroup(combined);
	}

	public void display() {
		System.out.printf("%-15s \t %-15s \n", "Name", "Total Score");
		for (SatStudent s : this.group) {
			System.out.printf("%-15s \t %-15s \n", s.name, s.grade);
		}
	}

	public String getMax() {
		int index = 0;
		int score = Integer.MIN_VALUE;
		for (int i = 0; i < this.group.length; i++) {
			if (this.group[i].grade > score) {
				index = i;
				score = this.group[i].grade;
			}
		}
		return this.group[index].name;
	}

	public String getMin() {
		int index = 0;
		int score = Integer.MAX_VALUE;
		for (int i = 0; i < this.group.length; i++) {
			if (this.group[i].grade < score) {
				index = i;
				score = this.group[i].grade;
			}
		}
		return this.group[index].name;
	}

	public double getScholarShipAverage() {
		return new GuidanceGroup(this.scholarship()).average();
	}

	public int getScore(String lookFor) {
		for (SatStudent s : this.group) {
			if (s.name.equals(lookFor)) {
				return s.grade;
			}
		}
		return -1;
	}

	public SatStudent[] scholarship() {
		int size = 0;
		for (SatStudent s : this.group) {
			if (s.grade > 1900) {
				size++;
			}
		}

		SatStudent[] students = new SatStudent[size];
		for (int group = 0, scholar = 0; group < this.group.length; group++) {
			if (this.group[group].grade > 1900) {
				students[scholar] = this.group[group];
				scholar++;
			}
		}
		return students;
	}

	public void sortByName() {
		int n = this.group.length;
		for (int i = 0; i < (n - 1); i++) {
			for (int j = 0; j < (n - i - 1); j++) {
				if (this.group[j].name.compareToIgnoreCase(this.group[j + 1].name) > 0) {
					SatStudent temp = this.group[j];
					this.group[j] = this.group[j + 1];
					this.group[j + 1] = temp;
				}
			}
		}
	}

	public void sortByTotalScore() {
		int n = this.group.length;
		for (int i = 0; i < (n - 1); i++) {
			for (int j = 0; j < (n - i - 1); j++) {
				if (this.group[j].grade > this.group[j + 1].grade) {
					SatStudent temp = this.group[j];
					this.group[j] = this.group[j + 1];
					this.group[j + 1] = temp;
				}
			}
		}
	}

	@Override
	public String toString() {
		String res = "[\n";
		for (SatStudent s : this.group) {
			res += s.toString() + ", \n";
		}
		return res + "]";
	}

}
