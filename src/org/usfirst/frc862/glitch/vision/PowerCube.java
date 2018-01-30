package org.usfirst.frc862.glitch.vision;

/**
 * 
 * @author Ethan Pelkie, Darren Tas
 * Container class containing data on Power cubes
 * 
 *
 */
public class PowerCube {
	private final int COLLECTOR_PIXELS_OFF_CENTER = 0;
	private final double DEGREES_PER_PIXEL = .1846590;
	private final int FRAMES_SINCE_CONTACT_CUTOFF = 40;
	private int x, y, framesSinceContact;
	private double angle, area;
	
	/**
	 * 
	 * @param x - pixels from left edge (pass directly from camera)
	 * @param y - pixels from top edge (pass directly from camera)
	 * @param width - width in pixels (pass directly from camera)
	 * @param height - height in pixels (pass directly from camera)
	 */
	public PowerCube(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.angle = (x - 176 - COLLECTOR_PIXELS_OFF_CENTER) * DEGREES_PER_PIXEL;
		this.area = width * height;
		framesSinceContact = 0;
		
	}
	
	public void updateCube(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.angle = (x - 176 - COLLECTOR_PIXELS_OFF_CENTER) * DEGREES_PER_PIXEL;
		this.area = width * height;
		framesSinceContact = 0;
		
	}
	
	/**
	 * Increments the contact timer by one frame
	 */
	public void incrementContactTimer() {
		framesSinceContact++;
	}
	
	/**
	 * Check whether a cube has been out of contact for longer than the cutoff
	 * @return boolean beyondContactLimit
	 */
	public boolean beyondContactCutoff() {
		return framesSinceContact > FRAMES_SINCE_CONTACT_CUTOFF;
	}

	/**
	 * Returns the number of pixels of the cube's center point from the left edge of the screen
	 * @return int x (pixels)
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Returns the number of pixels of the cube's center point from the top edge of the screen
	 * @return int y (pixels)
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Returns the angle from the camera to the center of the cube; left is negative, right is positive
	 * @return double angle (degrees)
	 */
	public double getAngle() {
		return angle;
	}

	/**
	 * Returns the area of the cube's bounding rectangle
	 * @return double area (pixels)
	 */
	public double getArea() {
		return area;
	}

}
