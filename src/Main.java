import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String baseDirPath = "C://Games/";

        String[] directoriesInGames = {"src", "res", "savegames", "temp"};
        String[] directoriesInSrc = {"main", "test"};
        String[] filesInMain = {"Main.java", "Utils.java"};
        String[] directoriesInRes = {"drawables", "vectors", "icons"};

        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < directoriesInGames.length; j++) {
            String fullPath = baseDirPath + directoriesInGames[j];
            File dir = new File(fullPath);
            String message = "";
            if (dir.mkdir())
                message = "Каталог " + dir.getName() + " создан" + "\n";
            sb.append(message);
        }

        for (int j = 0; j < directoriesInSrc.length; j++) {
            String fullPath = baseDirPath + directoriesInGames[0] + "/" + directoriesInSrc[j] + "/";
            File dir = new File(fullPath);
            String message = "";
            if (dir.mkdir())
                message = "Каталог " + dir.getName() + " создан" + "\n";
            sb.append(message);
        }

        for (int j = 0; j < directoriesInRes.length; j++) {
            String fullPath = baseDirPath + directoriesInGames[1] + "/" + directoriesInRes[j] + "/";
            File dir = new File(fullPath);
            String message = "";
            if (dir.mkdir())
                message = "Каталог " + dir.getName() + " создан" + "\n";
            sb.append(message);
        }


        String fullDirectoryMainPath = baseDirPath + directoriesInGames[0] + "/" + directoriesInSrc[0] + "/";
        for (int i = 0; i < directoriesInGames.length; i++) {
            for (int j = 0; j < filesInMain.length; j++) {
                String fullMainFileName = fullDirectoryMainPath + filesInMain[j];
                File myFile = new File(fullMainFileName);
                try {
                    if (myFile.createNewFile())
                        sb.append("Файл " + myFile.getName() + " был создан" + "\n");
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

        File tempFile = new File("C://Games/temp/temp.txt");
        try {
            if (tempFile.createNewFile())
                sb.append("Файл " + tempFile.getName() + " был создан" + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter writer = new FileWriter("C://Games/temp/temp.txt", false)) {
            writer.write(String.valueOf(sb));
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

