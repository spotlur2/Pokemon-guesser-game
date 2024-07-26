import java.lang.Math;
import java.util.ArrayList;

class chooseInfoName {
  public String cIN(int type, int num) {
    String name = "";
    ArrayList<String> Enames = new ArrayList<String>();
    ArrayList<String> Fnames = new ArrayList<String>();
    ArrayList<String> Wnames = new ArrayList<String>();
    ArrayList<String> Inames = new ArrayList<String>();
    ArrayList<String> Rnames = new ArrayList<String>();
    //Electric
    Enames.add("Raichu");
    Enames.add("Zekrom");
    Enames.add("Luxio");
    Enames.add("Manectric");
    Enames.add("Jolteon");
    Enames.add("Pichu");
    Enames.add("Electrode");
    Enames.add("Plusle");
    Enames.add("Galvantula");
    Enames.add("Elektrik");
    //Fire
    Fnames.add("Charmander");
    Fnames.add("Charizard");
    Fnames.add("Flareon");
    Fnames.add("Ponyta");
    Fnames.add("Torchic");
    Fnames.add("Growlithe");
    Fnames.add("Torracat");
    Fnames.add("Fennekin");
    Fnames.add("Litten");
    Fnames.add("Rapidash");
    //Water
    Wnames.add("Squirtle");
    Wnames.add("Blastoise");
    Wnames.add("Poliwhirl");
    Wnames.add("Poliwrath");
    Wnames.add("Ducklett");
    Wnames.add("Spheal");
    Wnames.add("Totodile");
    Wnames.add("Vaporeon");
    Wnames.add("Gyarados");
    Wnames.add("Marill");
    //Ice
    Inames.add("Sandshrew");
    Inames.add("Sandslash");
    Inames.add("Vulpix");
    Inames.add("Lapras");
    Inames.add("Regice");
    Inames.add("Cubchoo");
    Inames.add("Avalugg");
    Inames.add("Frosmoth");
    Inames.add("Bergmite");
    Inames.add("Glastrier");
    //Rock
    Rnames.add("Geodude");
    Rnames.add("Nosepass");
    Rnames.add("Anorith");
    Rnames.add("Lairon");
    Rnames.add("Aron");
    Rnames.add("Shieldon");
    Rnames.add("Coalossal");
    Rnames.add("Rolycoly");
    Rnames.add("Bonsly");
    Rnames.add("Regirock");
    
    if (type == 0) {
      name = Enames.get(num-1);  
    }
    else if (type == 1) {
      name = Fnames.get(num-1);
    }
    else if (type == 2) {
      name = Wnames.get(num-1);
    }
    else if (type == 3) {
      name = Inames.get(num-1);
    }
    else if (type == 4) {
      name = Rnames.get(num-1);
    }
    
    num = (int)(1 + Math.random() * (Enames.size())); 
    return name;
  }
}
