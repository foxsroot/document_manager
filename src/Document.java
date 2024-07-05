import java.util.Date;

public abstract class Document {
    private String name;
    private final Date creationDate;
    private Date lastEditDate;
    private int totalPage;
    private String content;

    public Document(Date creationDate, String name, Date lastEditDate, int totalPage, String content) {
        this.creationDate = creationDate;
        this.name = name;
        this.lastEditDate = lastEditDate;
        this.totalPage = totalPage;
        this.content = content;
    }

    public Document(Document target) {
        this.creationDate =  target.creationDate;
        this.name = target.name;
        this.lastEditDate = target.getLastEditDate();
        this.totalPage = target.totalPage;
        this.content = target.content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(Date lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public abstract Document clone();
}
