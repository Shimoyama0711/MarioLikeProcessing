public class hatena_block extends Block {
    public static boolean hitted;
    /**
     * hatena_Blockをデフォルトで生成します
     */
    public hatena_block() {
        FileName = "resource/img/hatena_block.png";
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
    public hatena_block(float x, float y,boolean punched) {
        FileName = "resource/img/hatena_block.png";
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
    public hatena_block(float x, float y, float width, float height,boolean punched) {
        FileName = "resource/img/hatena_block.png";
        X = x;
        Y = y;
        Width = width;
        Height = height;
        hitted = punched;
    }



}
