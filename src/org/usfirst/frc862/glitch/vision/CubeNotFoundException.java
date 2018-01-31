package org.usfirst.frc862.glitch.vision;

public class CubeNotFoundException extends Exception {
	public CubeNotFoundException(int framesSinceContact) {
		super("A cube has not been seen in " + framesSinceContact + " frames.");
	}

}
