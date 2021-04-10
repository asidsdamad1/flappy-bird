package flappybirds;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Background {
    private BufferedImage backgroundImage;
    private BufferedImage backgroundImageSun;
    private BufferedImage backgroundImageSun1;
    private int x1, y1, x2, y2, x3, y3;

    public Background(){
        try {
            backgroundImage = ImageIO.read(new File("Assets/images.png"));
            backgroundImageSun = ImageIO.read(new File("Assets/imgbg.png"));
            backgroundImageSun1 = ImageIO.read(new File("Assets/imgbg1.png"));
        } catch (IOException ex) {}

        x1 = 0;
        y1 = 0;
        x2 = x1+830;
        y2 = 0;
        y3 = 0;
        x3 = x2+830;
    }

    public void Update(){
        x1-=2;
        x2-=2;

        if(x2 < 0) x3 = x2+830;
        if(x1 < 0) x2 = x1+830;
        if(x3 < 0) x2 = x3+830;
    }

    public void Paint(Graphics2D g2){
        g2.drawImage(backgroundImageSun, x1, y1, null);
        g2.drawImage(backgroundImageSun1, x2, y2, null);
        g2.drawImage(backgroundImageSun1, x3, y3, null);
//        g2.drawImage(backgroundImage, x2, y2, null);

    }

    public int getYGround(){
        return y1;
    }
}
