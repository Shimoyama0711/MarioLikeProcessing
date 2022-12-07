public class GroundBlock extends Block{
    public GroundBlock(){
        FileName = "resource/img/ground.png";
        X = 0;
        Y = 0;
        Width = 32;
        Height = 32;
    }

    public GroundBlock(float x, float y) {
        FileName = "resource/img/ground.png";
        X = x;
        Y = y;
        Width = 32;
        Height = 32;
    }

    public GroundBlock(float x, float y, float width, float height) {
        FileName = "resource/img/ground.png";
        X = x;
        Y = y;
        Width = width;
        Height = height;
    }
}
