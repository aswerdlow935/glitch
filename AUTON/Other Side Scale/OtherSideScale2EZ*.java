package org.usfirst.frc862.glitch.paths;
  
import java.util.ArrayList;

import org.usfirst.frc862.glitch.paths.PathBuilder.Waypoint;
import com.team254.lib.util.control.Path;
import com.team254.lib.util.math.RigidTransform2d;
import com.team254.lib.util.math.Rotation2d;
import com.team254.lib.util.math.Translation2d;

public class OtherSideScale2* implements PathContainer {
    
    @Override
    public Path buildPath() {
        ArrayList<Waypoint> sWaypoints = new ArrayList<Waypoint>();
        sWaypoints.add(new Waypoint(13,273,30,60));
        sWaypoints.add(new Waypoint(161,273,30,60));
        sWaypoints.add(new Waypoint(197,272,15,60));
        sWaypoints.add(new Waypoint(227,259,30,60));
        sWaypoints.add(new Waypoint(237,230,15,60));
        sWaypoints.add(new Waypoint(236,161,30,60));
        sWaypoints.add(new Waypoint(232,83,30,60));
        sWaypoints.add(new Waypoint(257,50,15,60));
        sWaypoints.add(new Waypoint(315,39,25,60));
        sWaypoints.add(new Waypoint(325,71,0,60));

        return PathBuilder.buildPathFromWaypoints(sWaypoints);
    }
    
    @Override
    public RigidTransform2d getStartPose() {
        return new RigidTransform2d(new Translation2d(13, 273), Rotation2d.fromDegrees(180.0)); 
    }

    @Override
    public boolean isReversed() {
        return false; 
    }
	// WAYPOINT_DATA: [{"position":{"x":13,"y":273},"speed":60,"radius":30,"comment":""},{"position":{"x":161,"y":273},"speed":60,"radius":30,"comment":""},{"position":{"x":197,"y":272},"speed":60,"radius":15,"comment":""},{"position":{"x":227,"y":259},"speed":60,"radius":30,"comment":""},{"position":{"x":237,"y":230},"speed":60,"radius":15,"comment":""},{"position":{"x":236,"y":161},"speed":60,"radius":30,"comment":""},{"position":{"x":232,"y":83},"speed":60,"radius":30,"comment":""},{"position":{"x":257,"y":50},"speed":60,"radius":15,"comment":""},{"position":{"x":315,"y":39},"speed":60,"radius":25,"comment":""},{"position":{"x":325,"y":71},"speed":60,"radius":0,"comment":""}]
	// IS_REVERSED: false
	// FILE_NAME: OtherSideScale2*
}