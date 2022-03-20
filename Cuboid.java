//problem 1 cuboid class
package prcode;

public class Cuboid extends Rectangle {
  int height;
  void setHeight(int h)
  {
    height=h;
  }
  void setLength(int l)
  {
    length=l;
  }
  void setWidth(int w)
  {
    width=w;
  }
  int getHeight()
  {
    return height;
  }
  int getLength()
  {
    return length;
  }
  int getWidth()
  {
    return width;
  }
  public String toString()
  {
    return "colour="+getBorderColour()+"\nFilled="+getFilled()+"\nLength ="+getLength()+"\nWidth="+getWidth()+"\nHeight ="+getHeight();
  }

}