package org.usfirst.frc862.glitch.paths;
  
import java.util.ArrayList;

import org.usfirst.frc862.glitch.paths.PathBuilder.Waypoint;
import com.team254.lib.util.control.Path;
import com.team254.lib.util.math.RigidTransform2d;
import com.team254.lib.util.math.Rotation2d;
import com.team254.lib.util.math.Translation2d;

public class OtherSideSwitch1Pos3* implements PathContainer {
    
    @Override
    public Path buildPath() {
        ArrayList<Waypoint> sWaypoints = new ArrayList<Waypoint>();
        sWaypoints.add(new Waypoint(12,65,30,60));
        sWaypoints.add(new Waypoint(62,161,30,60));
        sWaypoints.add(new Waypoint(82,205,60,60));
        sWaypoints.add(new Waypoint(134,285,30,60));
        sWaypoints.add(new Waypoint(170,273,15,60));
        sWaypoints.add(new Waypoint(181,240,0,60));

        return PathBuilder.buildPathFromWaypoints(sWaypoints);
    }
    
    @Override
    public RigidTransform2d getStartPose() {
        return new RigidTransform2d(new Translation2d(12, 65), Rotation2d.fromDegrees(180.0)); 
    }

    @Override
    public boolean isReversed() {
        return false; 
    }
	// WAYPOINT_DATA: [{"position":{"x":12,"y":65},"speed":60,"radius":30,"comment":""},{"position":{"x":62,"y":161},"speed":60,"radius":30,"comment":""},{"position":{"x":82,"y":205},"speed":60,"radius":60,"comment":""},{"position":{"x":134,"y":285},"speed":60,"radius":30,"comment":""},{"position":{"x":170,"y":273},"speed":60,"radius":15,"comment":""},{"position":{"x":181,"y":240},"speed":60,"radius":0,"comment":""}]
	// IS_REVERSED: false
	// FILE_NAME: OtherSideSwitch1Pos3*
}