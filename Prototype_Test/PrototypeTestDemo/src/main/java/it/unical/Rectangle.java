package it.unical;

public class Rectangle extends Shape {
    public int larghezza;
    public int altezza;

    public Rectangle() {}

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.larghezza = target.larghezza;
            this.altezza = target.altezza;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle) || !super.equals(obj)) return false;
        Rectangle shape2 = (Rectangle) obj;
        return shape2.larghezza == larghezza && shape2.altezza == altezza;
    }
}