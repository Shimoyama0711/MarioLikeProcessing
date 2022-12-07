public class BrickBlock extends Block {

    // public static boolean Hit;

    /**
     * BrickBlockをデフォルトで生成します
     */
    public BrickBlock() {
        FileName = "resource/img/brick.png";
        X = 0;
        Y = 0;
        Width = 32;
        Height = 32;
    }

    /**
     * BrickBlockを32×32pxで座標を指定して描画します
     *
     * @param x BrickBlockのX座標
     * @param y BrickBlockのY座標
     */
    public BrickBlock(float x, float y, float friction) {
        FileName = "resource/img/brick.png";
        X = x;
        Y = y;
    }

    /**
     * BrickBlockを解像度と座標を指定して描画します
     *
     * @param x BrickBlockのX座標
     * @param y BrickBlockのY座標
     * @param width BrickBlockの横幅
     * @param height BrickBlockの縦幅
     */
    public BrickBlock(float x, float y, float width, float height) {
        FileName = "resource/img/brick.png";
        X = x;
        Y = y;
        Width = width;
        Height = height;
    }

}
