public class HardBlock extends Block {
    /**
     * HardBlockをデフォルトで生成します
     */
    public HardBlock() {
        FileName = "resource/img/block/hard.png";
        X = 0;
        Y = 0;
        Width = 32;
        Height = 32;
    }

    /**
     * HardBlockを32×32pxで座標を指定して描画します
     *
     * @param x HardBlockのX座標
     * @param y HardBlockのY座標
     */
    public HardBlock(float x, float y) {
        FileName = "resource/img/block/hard.png";
        X = x;
        Y = y;
        Width = 32;
        Height = 32;
    }

    /**
     * HardBlockを解像度と座標を指定して描画します
     *
     * @param x HardBlockのX座標
     * @param y HardBlockのY座標
     * @param width HardBlockの横幅
     * @param height HardBlockの縦幅
     */
    public HardBlock(float x, float y, float width, float height) {
        FileName = "resource/img/block/ice.png";
        X = x;
        Y = y;
        Width = width;
        Height = height;
    }
}
