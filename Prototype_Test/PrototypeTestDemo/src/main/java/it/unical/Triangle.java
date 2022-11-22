package it.unical;

public class Triangle extends Shape {

    public int base;
    public int altezza;

    public Triangle() {}

    public Triangle(Triangle target) {
        super(target);
        if (target != null) {
            this.base = target.base;
            this.altezza = target.altezza;
        }
    }

    @Override
    public Shape clone() {
        return new Triangle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if ( !(obj instanceof Triangle) || super.equals(obj) ) return false;
        Triangle shape2 = (Triangle) obj;
        return shape2.base == base && shape2.altezza == altezza;
    }
}
