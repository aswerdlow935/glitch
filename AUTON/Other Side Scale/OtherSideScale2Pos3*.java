package org.usfirst.frc862.glitch.paths;
  
import java.util.ArrayList;

import org.usfirst.frc862.glitch.paths.PathBuilder.Waypoint;
import com.team254.lib.util.control.Path;
import com.team254.lib.util.math.RigidTransform2d;
import com.team254.lib.util.math.Rotation2d;
import com.team254.lib.util.math.Translation2d;

public class OtherSideScale2Pos3 implements PathContainer {
    
    @Override
    public Path buildPath() {
        ArrayList<Waypoint> sWaypoints = new ArrayList<Waypoint>();
        sWaypoints.add(new Waypoint(23,67,30,60));
        sWaypoints.add(new Waypoint(238,64,30,60));
        sWaypoints.add(new Waypoint(240,265,15,60));
        sWaypoints.add(new Waypoint(250,285,15,60));
        sWaypoints.add(new Waypoint(272,290,15,60));
        sWaypoints.add(new Waypoint(324,290,30,60));
        sWaypoints.add(new Waypoint(329,262,0,60));

        return PathBuilder.buildPathFromWaypoints(sWaypoints);
    }
    
    @Override
    public RigidTransform2d getStartPose() {
        return new RigidTransform2d(new Translation2d(23, 67), Rotation2d.fromDegrees(180.0)); 
    }

    @Override
    public boolean isReversed() {
        return false; 
    }
	// WAYPOINT_DATA: [{"position":{"x":23,"y":67},"speed":60,"radius":30,"comment":""},{"position":{"x":238,"y":64},"speed":60,"radius":30,"comment":""},{"position":{"x":240,"y":265},"speed":60,"radius":15,"comment":""},{"position":{"x":250,"y":285},"speed":60,"radius":15,"comment":""},{"position":{"x":272,"y":290},"speed":60,"radius":15,"comment":""},{"position":{"x":324,"y":290},"speed":60,"radius":30,"comment":""},{"position":{"x":329,"y":262},"speed":60,"radius":0,"comment":""}]
	// IS_REVERSED: false
	// FILE_NAME: OtherSideScale2Pos3
}