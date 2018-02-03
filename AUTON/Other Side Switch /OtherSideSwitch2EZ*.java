package org.usfirst.frc862.glitch.paths;
  
import java.util.ArrayList;

import org.usfirst.frc862.glitch.paths.PathBuilder.Waypoint;
import com.team254.lib.util.control.Path;
import com.team254.lib.util.math.RigidTransform2d;
import com.team254.lib.util.math.Rotation2d;
import com.team254.lib.util.math.Translation2d;

public class OtherSideSwitch2EZ* implements PathContainer {
    
    @Override
    public Path buildPath() {
        ArrayList<Waypoint> sWaypoints = new ArrayList<Waypoint>();
        sWaypoints.add(new Waypoint(13,240,30,60));
        sWaypoints.add(new Waypoint(177,269,30,60));
        sWaypoints.add(new Waypoint(219,264,15,60));
        sWaypoints.add(new Waypoint(232,238,30,60));
        sWaypoints.add(new Waypoint(239,182,30,60));
        sWaypoints.add(new Waypoint(238,111,30,60));
        sWaypoints.add(new Waypoint(231,64,30,60));
        sWaypoints.add(new Waypoint(200,54,15,60));
        sWaypoints.add(new Waypoint(176,58,15,60));
        sWaypoints.add(new Waypoint(171,88,0,60));

        return PathBuilder.buildPathFromWaypoints(sWaypoints);
    }
    
    @Override
    public RigidTransform2d getStartPose() {
        return new RigidTransform2d(new Translation2d(13, 240), Rotation2d.fromDegrees(180.0)); 
    }

    @Override
    public boolean isReversed() {
        return false; 
    }
	// WAYPOINT_DATA: [{"position":{"x":13,"y":240},"speed":60,"radius":30,"comment":""},{"position":{"x":177,"y":269},"speed":60,"radius":30,"comment":""},{"position":{"x":219,"y":264},"speed":60,"radius":15,"comment":""},{"position":{"x":232,"y":238},"speed":60,"radius":30,"comment":""},{"position":{"x":239,"y":182},"speed":60,"radius":30,"comment":""},{"position":{"x":238,"y":111},"speed":60,"radius":30,"comment":""},{"position":{"x":231,"y":64},"speed":60,"radius":30,"comment":""},{"position":{"x":200,"y":54},"speed":60,"radius":15,"comment":""},{"position":{"x":176,"y":58},"speed":60,"radius":15,"comment":""},{"position":{"x":171,"y":88},"speed":60,"radius":0,"comment":""}]
	// IS_REVERSED: false
	// FILE_NAME: OtherSideSwitch2EZ*
}