package SOLID.Software;

public class FileManagement implements FileStorage{

    @Override
    public void getFileStructure() {

    }
    public  static void copy(String Filename){}
    public static void move(String filename){}
    public static void delete(String filename){}
    public static void create(String filename){}
}

interface FileStorage{
    public void getFileStructure();
}