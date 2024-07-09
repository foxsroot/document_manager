import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Document> documents = new ArrayList<>();

        WordDocument tugasPBO = new WordDocument(new Date(), "Tugas PBO 1", new Date(), 14, "Ini tugas pbo", "Calibri", 12, PaperSize.A4);

        documents.add(tugasPBO);

        WordDocument cloneDocument = tugasPBO.clone(); //clone objek tugasPBO ke cloneDocument
        cloneDocument.setContent("Ini dokumen yg diclone :)");

        documents.add(cloneDocument);

        System.out.println(documents.get(0).getContent());
        System.out.println(documents.get(1).getContent());
    }
}
