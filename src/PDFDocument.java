import java.util.Date;

public class PDFDocument extends Document {
    private String password;

    public PDFDocument(Date creationDate, String name, Date lastEditDate, int totalPage, String content, String password) {
        super(creationDate, name, lastEditDate, totalPage, content);
        this.password = password;
    }

    public PDFDocument(PDFDocument target) {
        super(target);
        this.password = target.password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public PDFDocument clone() {
        return new PDFDocument(this);
    }
}
