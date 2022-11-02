import processing.core.PApplet;
import processing.core.PImage;
import processing.sound.SoundFile;

public class Main extends PApplet {
    public static void main(String[] args) {
        PApplet.main(Main.class.getName());
    }

    @Override
    public void settings() {
        size(720, 720);
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

        count++;
    }

    @Override
    public void mouseClicked() {
        count = -5;
        playSound("YEAH.mp3");
    }

    public void playSound(String fileName) {
        SoundFile sf = new SoundFile(this, "resource/sound/" + fileName);
        sf.play();
    }
}
