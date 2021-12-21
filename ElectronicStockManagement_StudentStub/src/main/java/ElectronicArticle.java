
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class ElectronicArticle {

    private int articleNumber;
    private String articleName;
    private int stock;
    private float price;
    private LocalDate orderDate;

    public ElectronicArticle(int articleNumber, String articleName, int stock, float price, LocalDate orderDate) {
        this.articleNumber = articleNumber;
        this.articleName = articleName;
        this.stock = stock;
        this.price = price;
        this.orderDate = orderDate;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public int getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(int articleNumber) {
        this.articleNumber = articleNumber;
    }

    // implement toString here
    @Override
    public String toString() {
        return "<" + this.articleNumber + "> " + "-" + "<" + this.articleName + "> " + "(<" + this.stock
                + ">) " + "Preis: " + "<" + this.price + "> " + "Bestelldatum: " + this.orderDate.parse("dd.MM.yyyy") + ">";
    }

    // implement equals here
    @Override
    public boolean equals(Object o) {
        boolean erg = false;
        if (this.articleName.equals(o)) {
            erg = true;
        }
        return erg;
    }
}
