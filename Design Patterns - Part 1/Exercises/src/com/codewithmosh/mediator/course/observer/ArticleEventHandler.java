package com.codewithmosh.mediator.course.observer;

public class ArticleEventHandler {
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();
    private ListBox selectedArticle = new ListBox();

    public ArticleEventHandler(){
        titleTextBox.addEventHandler(this::execTextBoxChanged);
        saveButton.addEventHandler(this::execButtonClicked);
        selectedArticle.addEventHandler(this::execListBoxSelected);
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
