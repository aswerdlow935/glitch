package org.usfirst.frc862.glitch.paths;
  
import java.util.ArrayList;

import org.usfirst.frc862.glitch.paths.PathBuilder.Waypoint;
import com.team254.lib.util.control.Path;
import com.team254.lib.util.math.RigidTransform2d;
import com.team254.lib.util.math.Rotation2d;
import com.team254.lib.util.math.Translation2d;

public class OtherSideSwitch2P* implements PathContainer {
    
    @Override
    public Path buildPath() {
        ArrayList<Waypoint> sWaypoints = new ArrayList<Waypoint>();
        sWaypoints.add(new Waypoint(12,283,30,60));
        sWaypoints.add(new Waypoint(175,285,15,60));
        sWaypoints.add(new Waypoint(220,275,15,60));
        sWaypoints.add(new Waypoint(233,245,15,60));
        sWaypoints.add(new Waypoint(235,194,30,60));
        sWaypoints.add(new Waypoint(236,56,20,60));
        sWaypoints.add(new Waypoint(192,40,15,60));
        sWaypoints.add(new Waypoint(168,55,15,60));
        sWaypoints.add(new Waypoint(166,84,0,60));

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
	// WAYPOINT_DATA: [{"position":{"x":12,"y":283},"speed":60,"radius":30,"comment":""},{"position":{"x":175,"y":285},"speed":60,"radius":15,"comment":""},{"position":{"x":220,"y":275},"speed":60,"radius":15,"comment":""},{"position":{"x":233,"y":245},"speed":60,"radius":15,"comment":""},{"position":{"x":235,"y":194},"speed":60,"radius":30,"comment":""},{"position":{"x":236,"y":56},"speed":60,"radius":20,"comment":""},{"position":{"x":192,"y":40},"speed":60,"radius":15,"comment":""},{"position":{"x":168,"y":55},"speed":60,"radius":15,"comment":""},{"position":{"x":166,"y":84},"speed":60,"radius":0,"comment":""}]
	// IS_REVERSED: false
	// FILE_NAME: OtherSideSwitch2P*
}