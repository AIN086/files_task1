import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        File src = new File("C://Games/src" );
        if (src.mkdir())
            sb.append("Каталог " + src.getName() + " создан" + "\n");

        File res = new File("C://Games/res" );
        if (res.mkdir())
            sb.append("Каталог " + res.getName() + " создан" + "\n");

        File savegames = new File("C://Games/savegames" );
        if (savegames.mkdir())
            sb.append("Каталог " + savegames.getName() + " создан" + "\n");

        File temp = new File("C://Games/temp" );
        if (temp.mkdir())
            sb.append("Каталог " + temp.getName() + " создан" + "\n");

        File main = new File("C://Games/src/main" );
        if (main.mkdir())
            sb.append("Каталог " + main.getName() + " создан" + "\n");

        File mainMain= new File("C://Games/src/main/Main.java" );
        try {
            if (mainMain.createNewFile())
                sb.append("Файл " + mainMain.getName() + " был создан" + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File test = new File("C://Games/test" );
        if (test.mkdir())
            sb.append("Каталог " + test.getName() + " создан" + "\n");

        File mainUtils= new File("C://Games/src/main/Utils.java" );
        try {
            if (mainUtils.createNewFile())
                sb.append("Файл " + mainUtils.getName() + " был создан" + "\n" );
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File drawables = new File("C://Games/res/drawables" );
        if (drawables.mkdir())
            sb.append("Каталог " + drawables.getName()+ " создан" + "\n");

        File vectors = new File("C://Games/res/vectors" );
        if (vectors.mkdir())
            sb.append("Каталог " + vectors.getName()+ " создан" + "\n");

        File icons = new File("C://Games/res/icons" );
        if (icons.mkdir())
            sb.append("Каталог " + icons.getName()+ " создан" + "\n");

        File tempFile= new File("C://Games/temp/temp.txt" );
        try {
            if (tempFile.createNewFile())
                sb.append("Файл " + tempFile.getName() + " был создан" + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter writer = new FileWriter("C://Games/temp/temp.txt", false)) {
            writer.write(String.valueOf(sb));
            writer.flush();
        } catch (IOException ex)
        { System.out.println(ex.getMessage());
        }
    }
}
