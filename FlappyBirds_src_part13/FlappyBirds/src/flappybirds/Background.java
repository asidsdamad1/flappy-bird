package flappybirds;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Background {
    private BufferedImage backgroundImage;

    private int x1, y1, x2, y2;

    public Background(){
        try {
            backgroundImage = ImageIO.read(new File("Assets/bg.png"));

        } catch (IOException ex) {}

        x1 = 0;
        y1 = 0;
        x2 = x1+830;
        y2 = 0;

    }

    public void Update(){
        x1-=2;
        x2-=2;

        if(x2 < 0) x1 = x2+830;
        if(x1 < 0) x2 = x1+830;

    }

    public void Paint(Graphics2D g2){
        g2.drawImage(backgroundImage, x1, y1, null);
        g2.drawImage(backgroundImage, x2, y2, null);

    }

    public int getYGround(){
        return y1;
    }
}
