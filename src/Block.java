import processing.core.PApplet;
import processing.core.PImage;

public class Block extends PApplet {
    public static float X;
    public static float Y;
    public static float Width;
    public static float Height;
    public static String FileName;

    // コンストラクタ //

    public Block() {
        FileName = "resource/img/mario0.png";
        X = 0;
        Y = 0;
        Width = 32;
        Height = 32;
    }

    /**
     * デフォルトの解像度32×32pxに設定してBlockを生成します
     *
     * @param fileName ファイル名
     * @param x imageのX座標
     * @param y imageのY座標
     */
    public Block(String fileName, float x, float y) {
        FileName = "resource/img/" + fileName;
        X = x;
        Y = y;
        Width = 32;
        Height = 32;
    }

    // SEPARATE //

    public float getX() {
        return X;
    }

    public float getY() {
        return Y;
    }

    public float getWidth() {
        return Width;
    }

    public float getHeight() {
        return Height;
    }

    public String getFileName() {
        return FileName;
    }

    // SEPARATE //

    public static void setX(float x) {
        Block.X = x;
    }

    public static void setY(float y) {
        Block.Y = y;
    }

    public static void setWidth(float width) {
        Block.Width = width;
    }

    public static void setHeight(float height) {
        Block.Height = height;
    }

    public static void setFileName(String fileName) {
        Block.FileName = fileName;
    }
}
