package org.example.file_server;

import java.util.HashMap;

public class FileLibrary {
    HashMap<String, File> files = new HashMap<>();
    public FileLibrary() {
    }

    public void addFile(String name) {
        File file = new File(name);
        files.put(name, file);
        file.setAdd(true);
        file.setDelete(false);
        file.setSend(false);
        file.addFilePrompt();
    }

    public void deleteFile(String name) {
        File file = new File(name);
        files.remove(name, file);
        file.setAdd(false);
        file.setDelete(true);
        file.setSend(false);
        file.deleteFilePrompt();
    }

    public void sendFile(String name) {
        File file = new File(name);
        file.setAdd(false);
        file.setDelete(false);
        file.setSend(true);
        file.sendFilePrompt();
    }



}



