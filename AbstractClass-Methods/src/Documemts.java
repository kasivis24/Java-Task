abstract class Document {
    String title;

    Document(String title) {
        this.title = title;
    }

    // Abstract methods
    public abstract void displayContent();
    public abstract void saveDocument();

    // Concrete method
    public void openDocument() {
        System.out.println("Opening document: " + title);
    }
}

class PDFDocument extends Document {
    PDFDocument(String title) {
        super(title);
    }

    @Override
    public void displayContent() {
        System.out.println("Displaying PDF content of " + title);
    }

    @Override
    public void saveDocument() {
        System.out.println("Saving PDF document: " + title);
    }
}

class TextDocument extends Document {
    TextDocument(String title) {
        super(title);
    }

    @Override
    public void displayContent() {
        System.out.println("Displaying Text content of " + title);
    }

    @Override
    public void saveDocument() {
        System.out.println("Saving Text document: " + title);
    }
}

class ImageDocument extends Document {
    ImageDocument(String title) {
        super(title);
    }

    @Override
    public void displayContent() {
        System.out.println("Displaying Image content of " + title);
    }

    @Override
    public void saveDocument() {
        System.out.println("Saving Image document: " + title);
    }
}

