package org.usfirst.frc862.glitch.paths;
  
import java.util.ArrayList;

import org.usfirst.frc862.glitch.paths.PathBuilder.Waypoint;
import com.team254.lib.util.control.Path;
import com.team254.lib.util.math.RigidTransform2d;
import com.team254.lib.util.math.Rotation2d;
import com.team254.lib.util.math.Translation2d;

public class OtherSideSwitch2Pos3* implements PathContainer {
    
    @Override
    public Path buildPath() {
        ArrayList<Waypoint> sWaypoints = new ArrayList<Waypoint>();
        sWaypoints.add(new Waypoint(14,67,0,0));
        sWaypoints.add(new Waypoint(146,58,30,60));
        sWaypoints.add(new Waypoint(194,57,25,60));
        sWaypoints.add(new Waypoint(225,74,15,60));
        sWaypoints.add(new Waypoint(235,93,15,60));
        sWaypoints.add(new Waypoint(235,120,15,60));
        sWaypoints.add(new Waypoint(238,164,30,60));
        sWaypoints.add(new Waypoint(240,197,30,60));
        sWaypoints.add(new Waypoint(238,249,30,60));
        sWaypoints.add(new Waypoint(217,277,15,60));
        sWaypoints.add(new Waypoint(185,280,15,60));
        sWaypoints.add(new Waypoint(173,240,0,60));

        return PathBuilder.buildPathFromWaypoints(sWaypoints);
    }
    
    @Override
    public RigidTransform2d getStartPose() {
        return new RigidTransform2d(new Translation2d(14, 67), Rotation2d.fromDegrees(180.0)); 
    }

    @Override
    public boolean isReversed() {
        return false; 
    }
	// WAYPOINT_DATA: [{"position":{"x":14,"y":67},"speed":0,"radius":0,"comment":""},{"position":{"x":146,"y":58},"speed":60,"radius":30,"comment":""},{"position":{"x":194,"y":57},"speed":60,"radius":25,"comment":""},{"position":{"x":225,"y":74},"speed":60,"radius":15,"comment":""},{"position":{"x":235,"y":93},"speed":60,"radius":15,"comment":""},{"position":{"x":235,"y":120},"speed":60,"radius":15,"comment":""},{"position":{"x":238,"y":164},"speed":60,"radius":30,"comment":""},{"position":{"x":240,"y":197},"speed":60,"radius":30,"comment":""},{"position":{"x":238,"y":249},"speed":60,"radius":30,"comment":""},{"position":{"x":217,"y":277},"speed":60,"radius":15,"comment":""},{"position":{"x":185,"y":280},"speed":60,"radius":15,"comment":""},{"position":{"x":173,"y":240},"speed":60,"radius":0,"comment":""}]
	// IS_REVERSED: false
	// FILE_NAME: OtherSideSwitch2Pos3*
}