public class Rectanger {
    double width, height;
    public  Rectanger() {}
    public Rectanger (double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea () {
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.height + this.width) *2;
    }
    public String display (){
        return "Rectanger {" + "width= " + width + ", height= " + height + "}";
    }
}
