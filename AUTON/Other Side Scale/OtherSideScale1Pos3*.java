package org.usfirst.frc862.glitch.paths;
  
import java.util.ArrayList;

import org.usfirst.frc862.glitch.paths.PathBuilder.Waypoint;
import com.team254.lib.util.control.Path;
import com.team254.lib.util.math.RigidTransform2d;
import com.team254.lib.util.math.Rotation2d;
import com.team254.lib.util.math.Translation2d;

public class OtherSideScale1Pos3* implements PathContainer {
    
    @Override
    public Path buildPath() {
        ArrayList<Waypoint> sWaypoints = new ArrayList<Waypoint>();
        sWaypoints.add(new Waypoint(14,67,30,60));
        sWaypoints.add(new Waypoint(88,225,30,60));
        sWaypoints.add(new Waypoint(108,245,15,60));
        sWaypoints.add(new Waypoint(142,265,30,60));
        sWaypoints.add(new Waypoint(202,287,30,60));
        sWaypoints.add(new Waypoint(243,296,30,60));
        sWaypoints.add(new Waypoint(280,292,30,60));
        sWaypoints.add(new Waypoint(317,278,15,60));
        sWaypoints.add(new Waypoint(323,260,0,60));

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
	// WAYPOINT_DATA: [{"position":{"x":14,"y":67},"speed":60,"radius":30,"comment":""},{"position":{"x":88,"y":225},"speed":60,"radius":30,"comment":""},{"position":{"x":108,"y":245},"speed":60,"radius":15,"comment":""},{"position":{"x":142,"y":265},"speed":60,"radius":30,"comment":""},{"position":{"x":202,"y":287},"speed":60,"radius":30,"comment":""},{"position":{"x":243,"y":296},"speed":60,"radius":30,"comment":""},{"position":{"x":280,"y":292},"speed":60,"radius":30,"comment":""},{"position":{"x":317,"y":278},"speed":60,"radius":15,"comment":""},{"position":{"x":323,"y":260},"speed":60,"radius":0,"comment":""}]
	// IS_REVERSED: false
	// FILE_NAME: OtherSideScale1Pos3*
}