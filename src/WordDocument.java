import java.util.Date;

public class WordDocument extends Document {
    private String fontType;
    private float fontSize;
    private PaperSize paperSize;

    public WordDocument(Date creationDate, String name, Date lastEditDate, int totalPage, String content, String fontType, float fontSize, PaperSize paperSize) {
        super(creationDate, name, lastEditDate, totalPage, content);
        this.fontType = fontType;
        this.fontSize = fontSize;
        this.paperSize = paperSize;
    }

    public WordDocument(WordDocument target) {
        //ini constructor buat clone. Bisa copy objek" yg private jg. Misalkan ada atribut" yg private dan cuma bisa diakses dari dalem class, bisa dicopy juga di sini
        super(target);
        this.fontType = target.fontType;
        this.fontSize = target.fontSize;
        this.paperSize = target.paperSize;
    }

    public String getFontType() {
        return fontType;
    }

    public void setFontType(String fontType) {
        this.fontType = fontType;
    }

    public float getFontSize() {
        return fontSize;
    }

    public void setFontSize(float fontSize) {
        this.fontSize = fontSize;
    }

    public PaperSize getPaperSize() {
        return paperSize;
    }

    public void setPaperSize(PaperSize paperSize) {
        this.paperSize = paperSize;
    }

    @Override
    public WordDocument clone() {
        return new WordDocument(this); //panggil constructor buat clone
    }
}
