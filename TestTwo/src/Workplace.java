

class DrumKit {
	boolean topHap = true;
	boolean snare = true;
	
	void playSnare() {
		System.out.println("bang bang ba-bang");
	}
	
	void playTopHat() {
		System.out.println("ding ding da-ding");
	}
}

class Workplace {
	public static void main(String[] args) {
		DrumKit d = new DrumKit();
		d.playSnare();
		d.playTopHat();
	}
}