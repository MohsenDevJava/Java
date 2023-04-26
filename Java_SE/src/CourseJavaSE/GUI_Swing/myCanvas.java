package CourseJavaSE.GUI_Swing;

import java.awt.*;

public class myCanvas extends Canvas {

    String picAddress;
    int xImg;
    int yImg;
    int wImg;
    int hImg;

    public myCanvas(String picture, int xImg, int yImg, int wImg, int hImg) {
        this.picAddress = picture;
        this.xImg = xImg;
        this.yImg = yImg;
        this.wImg = wImg;
        this.hImg = hImg;
    }

    public void paint(Graphics graphics){
       Image pic=Toolkit.getDefaultToolkit().getImage(picAddress);
       graphics.drawImage(pic,xImg,yImg,wImg,hImg,this);
    }

}
