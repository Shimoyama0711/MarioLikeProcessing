import processing.core.PApplet;

public class Block extends PApplet {
    public static float X;
    public static float Y;
    public static float Width;
    public static float Height;
    public static String FileName;

    // コンストラクタ //

    /**
     * デフォルトの設定でBlockを生成します
     */
    public Block() {
        FileName = "resource/img/entity/mario/mario0.png";
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

    /**
     * 解像度と座標を設定してBlockを生成します
     *
     * @param fileName ファイル名
     * @param x imageのX座標
     * @param y imageのY座標
     * @param width imageの幅
     * @param height imageの高さ
     */
    public Block(String fileName, float x, float y, float width, float height) {
        FileName = "resource/img/" + fileName;
        X = x;
        Y = y;
        Width = width;
        Height = height;
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

    public void setX(float x) {
        Block.X = x;
    }

    public void setY(float y) {
        Block.Y = y;
    }

    public void setWidth(float width) {
        Block.Width = width;
    }

    public void setHeight(float height) {
        Block.Height = height;
    }

    public void setFileName(String fileName) {
        Block.FileName = "resource/img/block/" + fileName;
    }
}
