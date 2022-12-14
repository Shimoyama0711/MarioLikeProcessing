import processing.core.PApplet;
import processing.sound.SoundFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main extends PApplet {
    Block b;
    File file = new File("src/resource/misc/course.txt");

    List<Entity> entityList = new ArrayList<>();

    float speed = 5.0f;

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

                        if (c == 'S') {
                            Mario tmp = new Mario(x, y);
                            entityList.add(tmp);

                            System.out.println("=====[ Mario ]=====");
                            System.out.println(x);
                            System.out.println(y);
                        } else if (c == 'K') {
                            entityList.add(new Kuribo(x, y));
                            System.out.println("=====[ Kuribo ]=====");
                            System.out.println(x);
                            System.out.println(y);
                        }
                    }
                }

                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    int count = 0;
    int DEATH = 0;

    @Override
    public void draw() {
        Mario mario = (Mario) entityList.get(0);

        background(0, 0, 0);

        if (DEATH < 0) {
            mario.setFileName("mario/mario-1-right.png");
            DEATH++;
        }

        drawEntity(mario);

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
                            GroundBlock gnd = new GroundBlock(x, y);
                            drawBlock(gnd);
                        } else if (c == 'I') {
                            IceBlock ice = new IceBlock(x, y, 1.0f);
                            drawBlock(ice);
                        } else if (c == '?') {
                            HatenaBlock h = new HatenaBlock(x, y, false);
                            drawBlock(h);
                        } else if (c == 'B') {
                            BrickBlock b = new BrickBlock(x, y);
                            drawBlock(b);
                        } else if (c == 'M') {
                            MagmaUpper M = new MagmaUpper(x, y);
                            drawBlock(M);
                        } else if (c == 'm') {
                            MagmaLower m = new MagmaLower(x, y);
                            drawBlock(m);
                        }
                    }
                }

                count++;
            }

            int tmp = 0;

            for (Entity entity : entityList) {
                drawEntity(entity);
                tmp++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        count++;
    }

    @Override
    public void keyPressed() {
        int random = new Random().nextInt(4);
        Mario mario = (Mario) entityList.get(0);
        String rot = mario.getFileName().contains("left") ? "left" : "right";

        if (keyCode == LEFT) {
            mario.setX(mario.getX() - speed);
            mario.setFileName("mario/mario" + random + "-left.png");
        }

        if (keyCode == RIGHT) {
            mario.setX(mario.getX() + speed);
            mario.setFileName("mario/mario" + random + "-right.png");
        }

        if (keyCode == UP) {
            mario.setY(mario.getY() - speed);
            mario.setFileName("mario/mario4-" + rot + ".png");
        }

        if (keyCode == DOWN) {
            mario.setY(mario.getY() + speed);
            mario.setFileName("mario/mario0-" + rot + ".png");
        }
    }

    @Override
    public void mouseClicked() {
        count = -10;
        DEATH = -10;

        playSound("yeah.mp3");
    }

    public void playSound(String fileName) {
        SoundFile sf = new SoundFile(this, "resource/sound/" + fileName);
        sf.play();
    }

    public void drawBlock(Block b) {
        if (b instanceof IceBlock ice) {
            image(loadImage(b.getFileName()), b.getX(), b.getY(), b.getWidth(), b.getHeight());
        } else {
            image(loadImage(b.getFileName()), b.getX(), b.getY(), b.getWidth(), b.getHeight());
        }
    }

    public void drawEntity(Entity e) {
        if (e instanceof Mario mario) {
            image(loadImage(mario.getFileName()), mario.getX(), mario.getY(), mario.getWidth(), mario.getHeight());
        } else if (e instanceof Kuribo kuribo) {
            image(loadImage("resource/img/entity/kuribo/kuribo-left.png"), kuribo.getX(), kuribo.getY(), kuribo.getWidth(), kuribo.getHeight());
        }
    }
}
