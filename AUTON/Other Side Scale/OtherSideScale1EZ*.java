package org.usfirst.frc862.glitch.paths;
  
import java.util.ArrayList;

import org.usfirst.frc862.glitch.paths.PathBuilder.Waypoint;
import com.team254.lib.util.control.Path;
import com.team254.lib.util.math.RigidTransform2d;
import com.team254.lib.util.math.Rotation2d;
import com.team254.lib.util.math.Translation2d;

public class OtherSideScale1EZ* implements PathContainer {
    
    @Override
    public Path buildPath() {
        ArrayList<Waypoint> sWaypoints = new ArrayList<Waypoint>();
        sWaypoints.add(new Waypoint(15,240,30,60));
        sWaypoints.add(new Waypoint(61,244,15,60));
        sWaypoints.add(new Waypoint(76,225,15,60));
        sWaypoints.add(new Waypoint(71,150,30,60));
        sWaypoints.add(new Waypoint(71,81,30,60));
        sWaypoints.add(new Waypoint(126,48,30,60));
        sWaypoints.add(new Waypoint(194,43,30,60));
        sWaypoints.add(new Waypoint(286,38,30,60));
        sWaypoints.add(new Waypoint(312,41,15,60));
        sWaypoints.add(new Waypoint(327,70,0,60));

        return PathBuilder.buildPathFromWaypoints(sWaypoints);
    }
    
    @Override
    public RigidTransform2d getStartPose() {
        return new RigidTransform2d(new Translation2d(15, 240), Rotation2d.fromDegrees(180.0)); 
    }

    @Override
    public boolean isReversed() {
        return false; 
    }
	// WAYPOINT_DATA: [{"position":{"x":15,"y":240},"speed":60,"radius":30,"comment":""},{"position":{"x":61,"y":244},"speed":60,"radius":15,"comment":""},{"position":{"x":76,"y":225},"speed":60,"radius":15,"comment":""},{"position":{"x":71,"y":150},"speed":60,"radius":30,"comment":""},{"position":{"x":71,"y":81},"speed":60,"radius":30,"comment":""},{"position":{"x":126,"y":48},"speed":60,"radius":30,"comment":""},{"position":{"x":194,"y":43},"speed":60,"radius":30,"comment":""},{"position":{"x":286,"y":38},"speed":60,"radius":30,"comment":""},{"position":{"x":312,"y":41},"speed":60,"radius":15,"comment":""},{"position":{"x":327,"y":70},"speed":60,"radius":0,"comment":""}]
	// IS_REVERSED: false
	// FILE_NAME: OtherSideScale1EZ*
}