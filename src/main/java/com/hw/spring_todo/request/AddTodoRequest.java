package com.hw.spring_todo.request;

public class AddTodoRequest {

    private String content;

    public AddTodoRequest(String content) {
        this.content = content;
    }

    public AddTodoRequest() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
