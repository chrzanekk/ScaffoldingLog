package pl.konradchrzanowski.scaffolding.log.scaffolding.dimensions;

public class Dimensions {
    Float length;
    Float width;
    Float height;

    public Dimensions(Float length, Float width, Float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Float getLength() {
        return length;
    }

    public Float getWidth() {
        return width;
    }

    public Float getHeight() {
        return height;
    }
}
