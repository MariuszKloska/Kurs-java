package pl.hydromax.Drive;

import pl.hydromax.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
