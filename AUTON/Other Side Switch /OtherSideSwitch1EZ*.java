package org.usfirst.frc862.glitch.paths;
  
import java.util.ArrayList;

import org.usfirst.frc862.glitch.paths.PathBuilder.Waypoint;
import com.team254.lib.util.control.Path;
import com.team254.lib.util.math.RigidTransform2d;
import com.team254.lib.util.math.Rotation2d;
import com.team254.lib.util.math.Translation2d;

public class OtherSideSwitch1EZ* implements PathContainer {
    
    @Override
    public Path buildPath() {
        ArrayList<Waypoint> sWaypoints = new ArrayList<Waypoint>();
        sWaypoints.add(new Waypoint(10,241,30,60));
        sWaypoints.add(new Waypoint(68,237,15,60));
        sWaypoints.add(new Waypoint(77,214,15,60));
        sWaypoints.add(new Waypoint(71,150,30,60));
        sWaypoints.add(new Waypoint(79,101,30,60));
        sWaypoints.add(new Waypoint(117,54,20,60));
        sWaypoints.add(new Waypoint(155,40,20,60));
        sWaypoints.add(new Waypoint(174,84,0,60));

        return PathBuilder.buildPathFromWaypoints(sWaypoints);
    }
    
    @Override
    public RigidTransform2d getStartPose() {
        return new RigidTransform2d(new Translation2d(10, 241), Rotation2d.fromDegrees(180.0)); 
    }

    @Override
    public boolean isReversed() {
        return false; 
    }
	// WAYPOINT_DATA: [{"position":{"x":10,"y":241},"speed":60,"radius":30,"comment":""},{"position":{"x":68,"y":237},"speed":60,"radius":15,"comment":""},{"position":{"x":77,"y":214},"speed":60,"radius":15,"comment":""},{"position":{"x":71,"y":150},"speed":60,"radius":30,"comment":""},{"position":{"x":79,"y":101},"speed":60,"radius":30,"comment":""},{"position":{"x":117,"y":54},"speed":60,"radius":20,"comment":""},{"position":{"x":155,"y":40},"speed":60,"radius":20,"comment":""},{"position":{"x":174,"y":84},"speed":60,"radius":0,"comment":""}]
	// IS_REVERSED: false
	// FILE_NAME: OtherSideSwitch1EZ*
}