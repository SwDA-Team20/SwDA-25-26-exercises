package solid.dip.compliant;


public class DocumentManager {

    private String text;
    private PrinterService pService;

    public DocumentManager(String text, PrinterService pService) {
        this.text = text;
        this.pService = pService;
    }

    public void addText(String text) {
        this.text += text;
    }

    public void printDocument() {
        pService.print(text);
    }

  
}
