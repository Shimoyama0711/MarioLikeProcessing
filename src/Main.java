import processing.core.PApplet;
import processing.core.PImage;
import processing.sound.SoundFile;

import java.util.Random;

public class Main extends PApplet {
    Block b;

    public static void main(String[] args) {
        String[] classes = {Main.class.getName(), Block.class.getName()};
        PApplet.main(classes);
    }

    @Override
    public void settings() {
        size(640, 360);
        b = new Block("ice.png", 128, 128);
        System.out.println(b.getFileName());
    }

    @Override
    public void setup() {
        frameRate(60);
        playSound("kumabachi.mp3");
    }

    int count = 0;

    @Override
    public void draw() {
        background(0, 0, 0);

        for (int x = 0; x <= width; x += 96) {
            for (int y = 0; y <= height; y += 96) {
                int r = (count < 0) ? -1 : (int) random(0, 5);
                String fileName = "resource/img/mario" + r + ".png";
                PImage img = loadImage(fileName);

                image(img, x, y, 32, 32);
            }
        }

        //image(loadImage(b.getFileName()), b.getX(), b.getY(), 32, 32);

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int random = new Random().nextInt(2);

                if ((i + j) % 8 == 0) {
                    if (random == 0) {
                        IceBlock ice = new IceBlock((i * 32), (j * 32), 1.0f);
                        drawBlock(ice);
                    } else {
                        HardBlock hard = new HardBlock((i * 32), (j * 32));
                        drawBlock(hard);
                    }
                }
            }
        }

        count++;
    }

    @Override
    public void mouseClicked() {
        count = -10;
        playSound("YEAH.mp3");
    }

    public void playSound(String fileName) {
        SoundFile sf = new SoundFile(this, "resource/sound/" + fileName);
        sf.play();
    }

    public void drawBlock(Block b) {
        if (b instanceof IceBlock) {
            IceBlock ice = (IceBlock) b;

            image(loadImage(b.getFileName()), b.getX(), b.getY(), b.getWidth(), b.getHeight());
        } else {
            image(loadImage(b.getFileName()), b.getX(), b.getY(), b.getWidth(), b.getHeight());
        }
    }
}
