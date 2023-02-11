package org.example.file_server;

import java.util.HashMap;

public class FileLibrary {
    HashMap<String, File> files = new HashMap<>();
    public FileLibrary() {
    }

    public void addFile(String name) {
        File file = new File(name);
        file.setAdd(true);
        file.setDelete(false);
        file.setSend(false);
        file.addFilePrompt();
        files.put(file.getName(), file);
    }
    public void deleteFile(String name) {
        files.get(name).setAdd(false);
        files.get(name).setDelete(true);
        files.get(name).setSend(false);
        files.get(name).deleteFilePrompt();
        files.remove(name);
    }

    public void sendFile(String name) {
        files.get(name).sendFilePrompt();
        files.get(name).setAdd(false);
        files.get(name).setDelete(false);
        files.get(name).setSend(true);
    }

    @Override
    public String toString() {
        return "FileLibrary{" +
                "files=" + files +
                '}';
    }
}



