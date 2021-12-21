
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ArticleFileManager {

    public static List<ElectronicArticle> readStockFile(String filename) throws IOException {
        List<ElectronicArticle> lines = Files.readAllLines(filename);
        return lines;
    }

    public void printArticles() {

    }

    public void printAllArticles() {

    }
}
