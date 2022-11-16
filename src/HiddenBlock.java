public class HiddenBlock extends Block {
    public static boolean Hit;

    public HiddenBlock(){
        FileName="resource/img/isHitBlock.png";
        X=0;
        Y=0;
        Width=32;
        Height=32;
        Hit = false;
    }
    public HiddenBlock(float x,float y, boolean isHit){
        FileName="resource/img/isHitBlock.png";
        X=x;
        Y=y;
        Width = 32;
        Height = 32;
        Hit = isHit;
    }
    public HiddenBlock(float x,float y,float width,float height, boolean isHit){
        FileName="resource/img/isHitBlock.png";
        X=x;
        Y=y;
        Width=width;
        Height=height;
        Hit = isHit;
    }

    public boolean isHit() {
        return Hit;
    }

    public void setHit(boolean hit) {
        Hit = hit;
    }
}
