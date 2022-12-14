public class Kuribo extends Entity {
    public Kuribo() {
        FileName = "resource/img/entity/kuribo/kuribo-right.png";
        X = 0;
        Y = 0;
        Width = 32;
        Height = 32;
    }

    public Kuribo(float x, float y) {
        FileName = "resource/img/entity/kuribo/kuribo-right.png";
        X = x;
        Y = y;
        Width = 32;
        Height = 32;
    }

    public Kuribo(float x, float y, float width, float height) {
        FileName = "resource/img/entity/kuribo/kuribo-right.png";
        X = x;
        Y = y;
        Width = width;
        Height = height;
    }
}
