package org.usfirst.frc862.glitch.paths;
  
import java.util.ArrayList;

import org.usfirst.frc862.glitch.paths.PathBuilder.Waypoint;
import com.team254.lib.util.control.Path;
import com.team254.lib.util.math.RigidTransform2d;
import com.team254.lib.util.math.Rotation2d;
import com.team254.lib.util.math.Translation2d;

public class OtherSideScale1P* implements PathContainer {
    
    @Override
    public Path buildPath() {
        ArrayList<Waypoint> sWaypoints = new ArrayList<Waypoint>();
        sWaypoints.add(new Waypoint(12,283,30,60));
        sWaypoints.add(new Waypoint(58,283,20,60));
        sWaypoints.add(new Waypoint(68,263,15,60));
        sWaypoints.add(new Waypoint(74,214,30,60));
        sWaypoints.add(new Waypoint(72,102,30,60));
        sWaypoints.add(new Waypoint(108,70,30,60));
        sWaypoints.add(new Waypoint(162,48,30,60));
        sWaypoints.add(new Waypoint(214,41,30,60));
        sWaypoints.add(new Waypoint(284,37,15,60));
        sWaypoints.add(new Waypoint(310,35,15,60));
        sWaypoints.add(new Waypoint(326,70,30,60));

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
	// WAYPOINT_DATA: [{"position":{"x":12,"y":283},"speed":60,"radius":30,"comment":""},{"position":{"x":58,"y":283},"speed":60,"radius":20,"comment":""},{"position":{"x":68,"y":263},"speed":60,"radius":15,"comment":""},{"position":{"x":74,"y":214},"speed":60,"radius":30,"comment":""},{"position":{"x":72,"y":102},"speed":60,"radius":30,"comment":""},{"position":{"x":108,"y":70},"speed":60,"radius":30,"comment":""},{"position":{"x":162,"y":48},"speed":60,"radius":30,"comment":""},{"position":{"x":214,"y":41},"speed":60,"radius":30,"comment":""},{"position":{"x":284,"y":37},"speed":60,"radius":15,"comment":""},{"position":{"x":310,"y":35},"speed":60,"radius":15,"comment":""},{"position":{"x":326,"y":70},"speed":60,"radius":30,"comment":""}]
	// IS_REVERSED: false
	// FILE_NAME: OtherSideScale1P*
}