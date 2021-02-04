package poly;

public interface Shape {
    void draw() ;
    void erase() ;
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}


class Triangle implements Shape{

    @Override

    public void draw() {
        System.out.println(" Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println(" Triangle.erase()");
    }
}

class  Shapes{
    public  static Shape randShape(){
        Shape temp ;
        switch ((int)(Math.random()*3)){
            default:
            case  0: temp = new Circle() ; break;
            case  1: temp = new Square() ; break;
            case  2: temp = new Triangle() ; break;
        }
        return temp ;
    }

    public static void main(String[] args) {
        Shape[] s = new Shape[9] ;
        for (int i = 0; i <s.length ; i++) {

            s[i] = randShape() ;
        }
        for (int i = 0; i <s.length ; i++) {
            s[i].draw();
        }
    }
}