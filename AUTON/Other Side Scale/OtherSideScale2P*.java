package org.usfirst.frc862.glitch.paths;
  
import java.util.ArrayList;

import org.usfirst.frc862.glitch.paths.PathBuilder.Waypoint;
import com.team254.lib.util.control.Path;
import com.team254.lib.util.math.RigidTransform2d;
import com.team254.lib.util.math.Rotation2d;
import com.team254.lib.util.math.Translation2d;

public class OtherSideScale2P* implements PathContainer {
    
    @Override
    public Path buildPath() {
        ArrayList<Waypoint> sWaypoints = new ArrayList<Waypoint>();
        sWaypoints.add(new Waypoint(12,283,30,60));
        sWaypoints.add(new Waypoint(182,289,30,60));
        sWaypoints.add(new Waypoint(218,274,30,60));
        sWaypoints.add(new Waypoint(230,254,15,60));
        sWaypoints.add(new Waypoint(233,215,15,60));
        sWaypoints.add(new Waypoint(229,77,30,60));
        sWaypoints.add(new Waypoint(266,52,30,60));
        sWaypoints.add(new Waypoint(306,46,15,60));
        sWaypoints.add(new Waypoint(319,44,15,60));
        sWaypoints.add(new Waypoint(326,69,0,60));

        return PathBuilder.buildPathFromWaypoints(sWaypoints);
    }
    
    @Override
    public RigidTransform2d getStartPose() {
        return new RigidTransform2d(new Translation2d(12, 283), Rotation2d.fromDegrees(180.0)); 
    }

    @Override
    public boolean isReversed() {
        return false; 
    }
	// WAYPOINT_DATA: [{"position":{"x":12,"y":283},"speed":60,"radius":30,"comment":""},{"position":{"x":182,"y":289},"speed":60,"radius":30,"comment":""},{"position":{"x":218,"y":274},"speed":60,"radius":30,"comment":""},{"position":{"x":230,"y":254},"speed":60,"radius":15,"comment":""},{"position":{"x":233,"y":215},"speed":60,"radius":15,"comment":""},{"position":{"x":229,"y":77},"speed":60,"radius":30,"comment":""},{"position":{"x":266,"y":52},"speed":60,"radius":30,"comment":""},{"position":{"x":306,"y":46},"speed":60,"radius":15,"comment":""},{"position":{"x":319,"y":44},"speed":60,"radius":15,"comment":""},{"position":{"x":326,"y":69},"speed":60,"radius":0,"comment":""}]
	// IS_REVERSED: false
	// FILE_NAME: OtherSideScale2P*
}