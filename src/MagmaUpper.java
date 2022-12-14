public class MagmaUpper extends Block {

    // public static boolean Hit;

    /**
     * Magma_upperをデフォルトで生成します
     */
    public MagmaUpper() {
        FileName = "resource/img/block/magma1.png";
        X = 0;
        Y = 0;
        Width = 32;
        Height = 32;
    }

    /**
     * Magma_upperを32×32pxで座標を指定して描画します
     *
     * @param x Magma_upperのX座標
     * @param y Magma_upperのY座標
     */
    public MagmaUpper(float x, float y) {
        FileName = "resource/img/block/magma1.png";
        X = x;
        Y = y;
    }

    /**
     * Magma_upperを解像度と座標を指定して描画します
     *
     * @param x Magma_upperのX座標
     * @param y Magma_upperのY座標
     * @param width Magma_upperの横幅
     * @param height Magma_upperの縦幅
     */
    public MagmaUpper(float x, float y, float width, float height) {
        FileName = "resource/img/block/magma1.png";
        X = x;
        Y = y;
        Width = width;
        Height = height;
    }

}