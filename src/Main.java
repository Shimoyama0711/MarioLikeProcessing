import processing.core.PApplet;
import processing.core.PImage;
import processing.sound.SoundFile;

public class Main extends PApplet {
    public static void main(String[] args) {
        PApplet.main(Main.class.getName());
    }

    @Override
    public void settings() {
        size(1280, 720);
    }

    @Override
    public void setup() {
        frameRate(60);

        SoundFile sf = new SoundFile(this, "resource/sound/kumabachi.mp3");
        sf.play();
    }

    @Override
    public void draw() {
        background(255, 255, 255);

        for (int x = 0; x <= width; x += 96) {
            for (int y = 0; y <= height; y += 96) {
                int r = (int) random(0, 5);
                String fileName = "resource/img/mario" + r + ".png";
                PImage img = loadImage(fileName);

                image(img, x, y, 32, 32);
            }
        }
    }
}
