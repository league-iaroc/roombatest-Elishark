package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		for (int j = 0; j < 2; j++) {
			driveDirect(500, 500);
			sleep(1400);
			driveDirect(300, 500);
			sleep(1050);
			driveDirect(500, 500);
			sleep(1500);
			driveDirect(500, 300);
			sleep(1000);
		}
	}

	public void loop() {

	}
}
