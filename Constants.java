import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;

import javax.swing.*;
import javax.imageio.*;

import java.io.*;

import java.awt.geom.*;

import java.lang.Math.*;

import java.util.ArrayList;

public final class Constants {
    // Runtime
    public static final int REFRESH_TIMER = 1;

    // Display  
    public static final int WIDTH  = 1200;
    public static final int HEIGHT = 800;
    public static final int IFW    = JComponent.WHEN_IN_FOCUSED_WINDOW;

    // Physics
    public static final double GRAVITY = (-5 / (1000 / (double)REFRESH_TIMER));
    public static final double FRIC    = 0.9;

    // Player
    public static final String MOVE_LEFT           = "move left";
    public static final String MOVE_RIGHT          = "move right";
    public static final String MOVE_LEFT_RELEASED  = "move left released";
    public static final String MOVE_RIGHT_RELEASED = "move right released";

    public static final String JUMP                = "jump";
    public static final double PLAYER_MOVE_SPEED   = 0.8;
    public static final double PLAYER_ACC          = 0.2;
    public static final double PLAYER_JUMP_SPEED   = 1.5;
    public static final double PLAYER_MASS         = 1;
}
