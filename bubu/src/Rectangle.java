public class Rectangle {
    private double length = 1;
    private double width = 1;

    public Rectangle(double length,double width)
    {
        setLength(length);
        setWidth(width);
    }
    public Rectangle()
    {
        length = 1;
        width = 1;
    }
    public double Perimeter()
    {
        return 2*length + 2*width;
    }
    public double Area()
    {
        return length*width;
    }
    public void setLength(double length)
    {
        if(length>0 && length <=20)
            this.length = length;
        else
            throw new IllegalArgumentException("length must be between 1 and 20");
    }
    public void setWidth(double width)
    {
        if (width > 0 && width <= 20)
            this.width = width;
        else
            throw new IllegalArgumentException("width must be between 1 and 20");
    }
    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }
}
