// Multilevel Inheritance
package dayfive.multilevelinheritance.texteditor;

public class NotePad {
    protected String content;

    public Notepad() {
        this.content = "";
    }

    public void write(String text) {
        content += text;
    }

    public void displayContent() {
        System.out.println("Notepad Content: " + content);
    }
}