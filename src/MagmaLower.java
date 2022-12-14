public class MagmaLower extends Block {

    // public static boolean Hit;

    /**
     * Magma_lowerをデフォルトで生成します
     */
    public MagmaLower() {
        FileName = "resource/img/block/magma2.png";
        X = 0;
        Y = 0;
        Width = 32;
        Height = 32;
    }

    /**
     * Magma_lowerを32×32pxで座標を指定して描画します
     *
     * @param x Magma_lowerのX座標
     * @param y Magma_lowerのY座標
     */
    public MagmaLower(float x, float y) {
        FileName = "resource/img/block/magma2.png";
        X = x;
        Y = y;
    }

    /**
     * Magma_lowerを解像度と座標を指定して描画します
     *
     * @param x Magma_lowerのX座標
     * @param y Magma_lowerのY座標
     * @param width Magma_lowerの横幅
     * @param height Magma_lowerの縦幅
     */
    public MagmaLower(float x, float y, float width, float height) {
        FileName = "resource/img/block/magma2.png";
        X = x;
        Y = y;
        Width = width;
        Height = height;
    }

}