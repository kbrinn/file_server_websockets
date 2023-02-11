package org.example.file_server;

public class File {

    private String name;
    private boolean add = false;
    private boolean delete = false;
    private boolean send = false;


    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public boolean isSend() {
        return send;
    }

    public void setSend(boolean send) {
        this.send = send;
    }

    public void addFilePrompt() {
        System.out.println("The file " + this.getName() + " added successfully" );
    }

    public void sendFilePrompt() {
        System.out.println("The file " + this.getName() + " was sent");
    }

    public void deleteFilePrompt() {
        System.out.println("The file " + this.getName() + " was deleted");
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                '}';
    }
}
