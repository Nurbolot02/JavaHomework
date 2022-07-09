package useFulFutires;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileN {
    public static String BufferedReader(String path) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String str = null;
            StringBuilder stringBuilder = new StringBuilder();
            String nLine = "\n";

            while ((str = reader.readLine()) != null) {
                stringBuilder.append(str);
                stringBuilder.append(nLine);
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            reader.close();
            return stringBuilder.toString();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Не удалось прочитат файл!");
            return null;
        }
    }

    public static void Writer(String str, String path, boolean f){
        try{
            FileWriter fw = new FileWriter(path, f);
            fw.write(String.valueOf(str));
            fw.append("\n");
            fw.flush();
            System.out.println("File writed");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Ошибка при записи файла");
        }
    }
}
