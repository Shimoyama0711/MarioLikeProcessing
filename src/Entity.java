public class Entity {
    public float X;
    public float Y;
    public float Width;
    public float Height;
    public String FileName;
    // コンストラクタ //

    /**
     * デフォルトの設定でEntityを生成します
     */
    public Entity() {
        X = 0;
        Y = 0;
        Width = 32;
        Height = 32;
        FileName = "resource/img/entity/mario/mario0.png";
    }

    /**
     * デフォルトの解像度32×32pxに設定してEntityを生成します
     *
     * @param fileName ファイル名
     * @param x EntityのX座標
     * @param y EntityのY座標
     */
    public Entity(String fileName, float x, float y) {
        X = x;
        Y = y;
        Width = 32;
        Height = 32;
        FileName = "resource/img/" + fileName;
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
        X = x;
        Y = y;
        Width = width;
        Height = height;
        FileName = "resource/img/" + fileName;
    }

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

    public void setX(float x) {
        X = x;
    }

    public void setY(float y) {
        Y = y;
    }

    public void setWidth(float width) {
        Width = width;
    }

    public void setHeight(float height) {
        Height = height;
    }

    public void setFileName(String fileName) {
        FileName = "resource/img/entity/" + fileName;
    }
}
