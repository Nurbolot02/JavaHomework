package Lesson2;

import java.io.File;

public class WorkWithFile {
    public static void main(String[] args) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/src/main/java/Lesson1/output.txt");
            File file = new File(pathFile);
            String pathFolder = pathProject.concat("/src/main/java/Lesson1/ortrr");
            File dir = new File(pathFolder);
            if (dir.mkdir()){
                System.out.println("Dir created");

            }else{
                System.out.println(" Dir existed");
            }
            for ( String fmame : dir.list()){
                System.out.println(fmame);
            }
            if (file.createNewFile()){
                System.out.println("File created");
                System.out.println(file.isHidden());
                System.out.println(file.length());
                System.out.println(file.lastModified());

            }else{
                System.out.println(" File existed");
            }
        }catch (Exception ioe){
            System.out.println(ioe.getMessage());
        }


    }
}
