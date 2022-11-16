import processing.core.PApplet;
import processing.sound.SoundFile;

import java.io.*;

public class Main extends PApplet {
    Block b;
    File file = new File("src/resource/misc/course.txt");

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

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            int count = -1;
            int W = 0;
            String line;
            while ((line = br.readLine()) != null) {
                if (count == -1) {
                    W = Integer.parseInt(line.split(" ")[0]);
                } else {
                    for (int j = 0; j < W; j++) {
                        char c = line.charAt(j);
                        float x = (j * 32);
                        float y = (count * 32);

                        if (c == 'G') {
                            image(loadImage("resource/img/GroundBlock.png"), x, y, 32, 32);
                        } else if (c == 'I') {
                            image(loadImage("resource/img/ice.png"), x, y, 32, 32);
                        }
                    }
                }

                count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
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
