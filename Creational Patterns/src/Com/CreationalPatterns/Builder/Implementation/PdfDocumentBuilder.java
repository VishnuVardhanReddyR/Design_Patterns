package Com.CreationalPatterns.Builder.Implementation;

public class PdfDocumentBuilder implements PresentationBuilder{
    private PdfDocument document = new PdfDocument();

    public PdfDocument getPdfDocument(){
        return document;
    }

    @Override
    public void addSlide(Slide slide) {
        document.addPages(slide.getText());
    }
}
