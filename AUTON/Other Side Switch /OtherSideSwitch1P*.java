package org.usfirst.frc862.glitch.paths;
  
import java.util.ArrayList;

import org.usfirst.frc862.glitch.paths.PathBuilder.Waypoint;
import com.team254.lib.util.control.Path;
import com.team254.lib.util.math.RigidTransform2d;
import com.team254.lib.util.math.Rotation2d;
import com.team254.lib.util.math.Translation2d;

public class OtherSideSwitch1P* implements PathContainer {
    
    @Override
    public Path buildPath() {
        ArrayList<Waypoint> sWaypoints = new ArrayList<Waypoint>();
        sWaypoints.add(new Waypoint(15,281,15,60));
        sWaypoints.add(new Waypoint(54,270,20,60));
        sWaypoints.add(new Waypoint(70,218,30,60));
        sWaypoints.add(new Waypoint(68,178,30,60));
        sWaypoints.add(new Waypoint(66,110,15,60));
        sWaypoints.add(new Waypoint(80,78,15,60));
        sWaypoints.add(new Waypoint(116,58,28,60));
        sWaypoints.add(new Waypoint(158,54,25,60));
        sWaypoints.add(new Waypoint(170,84,0,60));

        return PathBuilder.buildPathFromWaypoints(sWaypoints);
    }
    
    @Override
    public RigidTransform2d getStartPose() {
        return new RigidTransform2d(new Translation2d(15, 281), Rotation2d.fromDegrees(180.0)); 
    }

    @Override
    public boolean isReversed() {
        return false; 
    }
	// WAYPOINT_DATA: [{"position":{"x":15,"y":281},"speed":60,"radius":15,"comment":""},{"position":{"x":54,"y":270},"speed":60,"radius":20,"comment":""},{"position":{"x":70,"y":218},"speed":60,"radius":30,"comment":""},{"position":{"x":68,"y":178},"speed":60,"radius":30,"comment":""},{"position":{"x":66,"y":110},"speed":60,"radius":15,"comment":""},{"position":{"x":80,"y":78},"speed":60,"radius":15,"comment":""},{"position":{"x":116,"y":58},"speed":60,"radius":28,"comment":""},{"position":{"x":158,"y":54},"speed":60,"radius":25,"comment":""},{"position":{"x":170,"y":84},"speed":60,"radius":0,"comment":""}]
	// IS_REVERSED: false
	// FILE_NAME: OtherSideSwitch1P*
}