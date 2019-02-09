package pl.edu.wszib.springhelloworld;

public class KsiegowaConfiguration {

    private BazaDanych fileBazaDanych = new FileBazaDanych();
    private BazaDanych mapBazaDanych = new MapBazaDanych();

    private boolean isFile;

    public KsiegowaConfiguration(boolean isFile){
        this.isFile = isFile;
    }

    public Księgowa dajKsiegowa(){
        return new Księgowa(isFile ? fileBazaDanych : mapBazaDanych);
    }
}
