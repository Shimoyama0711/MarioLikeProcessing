public class Entity {
    public static float X;
    public static float Y;
    public static float Width;
    public static float Height;
    public static String FileName;

    // コンストラクタ //

    /**
     * デフォルトの設定でEntityを生成します
     */
    public Entity() {
        FileName = "resource/img/mario0.png";
        X = 0;
        Y = 0;
        Width = 32;
        Height = 32;
    }

    /**
     * デフォルトの解像度32×32pxに設定してEntityを生成します
     *
     * @param fileName ファイル名
     * @param x EntityのX座標
     * @param y EntityのY座標
     */
    public Entity(String fileName, float x, float y) {
        FileName = "resource/img/" + fileName;
        X = x;
        Y = y;
        Width = 32;
        Height = 32;
    }


    /**
     * 解像度と座標を設定してEntityを生成します
     *
     * @param fileName ファイル名
     * @param x EntityのX座標
     * @param y EntityのY座標
     * @param width Entityの幅
     * @param height Entityの高さ
     */
    public Entity(String fileName, float x, float y, float width, float height) {
        FileName = "resource/img/" + fileName;
        X = x;
        Y = y;
        Width = width;
        Height = height;
    }

    public static float getX() {
        return X;
    }

    public static float getY() {
        return Y;
    }

    public static float getWidth() {
        return Width;
    }

    public static float getHeight() {
        return Height;
    }

    public static String getFileName() {
        return FileName;
    }

    public static void setX(float x) {
        X = x;
    }

    public static void setY(float y) {
        Y = y;
    }

    public static void setWidth(float width) {
        Width = width;
    }

    public static void setHeight(float height) {
        Height = height;
    }

    public static void setFileName(String fileName) {
        FileName = fileName;
    }
}
