public class Mario extends Entity {
    public Mario() {
        FileName = "resource/img/entity/mario/mario0-right.png";
        X = 0;
        Y = 0;
        Width = 32;
        Height = 32;
    }

    public Mario(float x, float y) {
        FileName = "resource/img/entity/mario/mario0-right.png";
        X = x;
        Y = y;
        Width = 32;
        Height = 32;
    }

    public Mario(float x, float y, float width, float height) {
        FileName = "resource/img/entity/mario/mario0-right.png";
        X = x;
        Y = y;
        Width = width;
        Height = height;
    }
}
