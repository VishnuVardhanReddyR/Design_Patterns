package mediator.observerimplementation;

public class ArticlesDialogBox {
    private ListBox articlesListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticlesDialogBox() {
//        articlesListBox.addEventHandler(new EventHandler() {          // Anonymous implementation of observer interface.
//            @Override
//            public void update() {
//                articleSelected();
//            }
//        });
//        articlesListBox.addEventHandler(() -> articleSelected()); // this is possible only in case of functional interface.

        articlesListBox.addEventHandler(this::articleSelected);  // here we are not calling the method, we adding reference to it
        titleTextBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction(){
        articlesListBox.setSelection("article 1");
        titleTextBox.setContent("");
        titleTextBox.setContent("article 3");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
    }

    private void titleChanged(){
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }

    private void articleSelected(){
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }
}
