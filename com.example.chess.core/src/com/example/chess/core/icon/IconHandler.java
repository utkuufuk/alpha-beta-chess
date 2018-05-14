package com.example.chess.core.icon;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import com.example.chess.core.model.Side;

public class IconHandler
{
    private static Path path;

    static
    {
        try
        {
            URL location = IconHandler.class.getProtectionDomain().getCodeSource().getLocation();
            path = Paths.get(location.toURI()).resolve("../com.example.chess.core/images");
        }
        catch (URISyntaxException e)
        {
            e.printStackTrace();
        }
    }

    public static Image getIcon(String pieceName, Side side)
    {
        String imageName = (side == Side.WHITE ? "white" : "black") + pieceName + ".png";
        return new Image(Display.getDefault(), path.resolve(imageName).toString());
    }

    public static Image getBlankIcon()
    {
        return new Image(Display.getDefault(), path.resolve("blank.png").toString());
    }
}
