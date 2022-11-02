public class IceBlock extends Block {
    public static float Friction;

    /**
     * IceBlockをデフォルトで生成します
     */
    public IceBlock() {
        FileName = "resource/img/ice.png";
        X = 0;
        Y = 0;
        Width = 32;
        Height = 32;
        Friction = 0;
    }

    /**
     * IceBlockを32×32pxで座標を指定して描画します
     *
     * @param x IceBlockのX座標
     * @param y IceBlockのY座標
     * @param friction IceBlockの摩擦係数
     */
    public IceBlock(float x, float y, float friction) {
        FileName = "resource/img/ice.png";
        X = x;
        Y = y;
        Friction = friction;
    }

    /**
     * IceBlockを解像度と座標を指定して描画します
     *
     * @param x IceBlockのX座標
     * @param y IceBlockのY座標
     * @param width IceBlockの横幅
     * @param height IceBlockの縦幅
     * @param friction IceBlockの摩擦係数
     */
    public IceBlock(float x, float y, float width, float height, float friction) {
        FileName = "resource/img/ice.png";
        X = x;
        Y = y;
        Width = width;
        Height = height;
        Friction = friction;
    }

    public static double getFriction() {
        return Friction;
    }

    public static void setFriction(float friction) {
        IceBlock.Friction = friction;
    }
}
