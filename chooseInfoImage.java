import java.lang.Math;
import java.util.ArrayList;

class chooseInfoImage {
  public String cII(int type, int num) {
    String imagePNG = "";
    ArrayList<String> Eimage = new ArrayList<String>();
    ArrayList<String> Fimage = new ArrayList<String>();
    ArrayList<String> Wimage = new ArrayList<String>();
    ArrayList<String> Iimage = new ArrayList<String>();
    ArrayList<String> Rimage = new ArrayList<String>();
    //Electric
    Eimage.add("Images/raichu.png");
    Eimage.add("Images/zekrom.png");
    Eimage.add("Images/luxio.png");
    Eimage.add("Images/manectric.png");
    Eimage.add("Images/jolteon.png");
    Eimage.add("Images/pichu.png");
    Eimage.add("Images/electrode.png");
    Eimage.add("Images/plusle.png");
    Eimage.add("Images/galvantula.png");
    Eimage.add("Images/elektrik.png");
    //Fire
    Fimage.add("Images/charmander.png");
    Fimage.add("Images/charizard.png");
    Fimage.add("Images/flareon.png");
    Fimage.add("Images/ponyta.png");
    Fimage.add("Images/torchic.png");
    Fimage.add("Images/growlithe.png");
    Fimage.add("Images/torracat.png");
    Fimage.add("Images/fennekin.png");
    Fimage.add("Images/litten.png");
    Fimage.add("Images/rapidash.png");
    //Water
    Wimage.add("Images/squirtle.png");
    Wimage.add("Images/blastoise.png");
    Wimage.add("Images/poliwhirl.png");
    Wimage.add("Images/poliwrath.png");
    Wimage.add("Images/ducklett.png");
    Wimage.add("Images/spheal.png");
    Wimage.add("Images/totdile.png");
    Wimage.add("Images/vaporeon.png");
    Wimage.add("Images/gyarados.png");
    Wimage.add("Images/marill.png");
    //Ice
    Iimage.add("Images/sandshrew.png");
    Iimage.add("Images/sandslash.png");
    Iimage.add("Images/vulpix.png");
    Iimage.add("Images/lapras.png");
    Iimage.add("Images/regice.png");
    Iimage.add("Images/cubchoo.png");
    Iimage.add("Images/avalugg.png");
    Iimage.add("Images/frosmoth.png");
    Iimage.add("Imagesberg/bergmite.png");
    Iimage.add("Images/glastrier.png");
    //Rock
    Rimage.add("Images.png/");
    Rimage.add("Images.png/");
    Rimage.add("Images.png/");
    Rimage.add("Images.png/");
    Rimage.add("Images.png/");
    Rimage.add("Images.png/");
    Rimage.add("Images.png/");
    Rimage.add("Images.png/");
    Rimage.add("Images.png/");
    Rimage.add("Images.png/");
    

    if (type == 0) {
      imagePNG = Eimage.get(num-1);  
    }
    else if (type == 1) {
      imagePNG = Fimage.get(num-1);
    }
    else if (type == 2) {
      imagePNG = Wimage.get(num-1);
    }
    else if (type == 3) {
      imagePNG = Iimage.get(num-1);
    }
    else if (type ==4) {
      imagePNG = Rimage.get(num-1);
    }

    num = (int)(1 + Math.random() * (Eimage.size())); 
    return imagePNG;
  }
}
