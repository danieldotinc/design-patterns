package com.codewithmosh.mediator.course;

public class ArticleDialogBox extends DialogBox {
    private TextBox titleTextBox = new TextBox(this);
    private Button saveButton = new Button(this);
    private ListBox selectedArticle = new ListBox(this);
    @Override
    public void changed(UIControl uiControl) {
        if (uiControl == titleTextBox) execTextBoxChanged();
        else if (uiControl == selectedArticle) execListBoxSelected();
        else if (uiControl == saveButton) execButtonClicked();
    }

    public void simulateUserInteraction(){
        selectedArticle.setSelection("Article 1");
        titleTextBox.setContent("");
        titleTextBox.setContent("Article 2");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
    }

    private void execButtonClicked() {

    }

    private void execListBoxSelected() {
        titleTextBox.setContent(selectedArticle.getSelection());
        saveButton.setEnabled(!titleTextBox.getContent().isEmpty());
    }

    private void execTextBoxChanged() {
        String content = titleTextBox.getContent();
        boolean isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }
}
