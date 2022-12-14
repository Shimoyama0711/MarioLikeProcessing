public class HatenaBlock extends Block {
    public static boolean hitted;
    /**
     * hatena_Blockをデフォルトで生成します
     */
    public HatenaBlock() {
        FileName = "resource/img/block/hatena.png";
        X = 0;
        Y = 0;
        Width = 32;
        Height = 32;
        hitted = false;
    }

    /**
     * IceBlockを32×32pxで座標を指定して描画します
     *
     * @param x BlockのX座標
     * @param y BlockのY座標
     */
    public HatenaBlock(float x, float y, boolean punched) {
        FileName = "resource/img/block/hatena.png";
        X = x;
        Y = y;
        hitted = punched;
    }

    /**
     * IceBlockを解像度と座標を指定して描画します
     *
     * @param x IceBlockのX座標
     * @param y IceBlockのY座標
     * @param width IceBlockの横幅
     * @param height IceBlockの縦幅
     */
    public HatenaBlock(float x, float y, float width, float height, boolean punched) {
        FileName = "resource/img/block/hatena.png";
        X = x;
        Y = y;
        Width = width;
        Height = height;
        hitted = punched;
    }



}
