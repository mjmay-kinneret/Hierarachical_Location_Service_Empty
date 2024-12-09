package il.ac.kinneret.mjmay.hls.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Entries for the file in the files table and results table
 * @author Michael J. May
 * @version 2024
 */
public class FileEntry {
    private StringProperty fileName;
    public void setFileName(String value) { fileNameProperty().set(value); }
    public String getFileName() { return fileNameProperty().get(); }
    public StringProperty fileNameProperty() {
        if (fileName == null) fileName = new SimpleStringProperty(this, "fileName");
        return fileName;
    }
    private StringProperty fileLocation;
    public void setFileLocation(String value) { fileLocationProperty().set(value); }
    public String getFileLocation() { return fileLocationProperty().get(); }
    public StringProperty fileLocationProperty() {
        if (fileLocation == null) fileLocation = new SimpleStringProperty(this, "fileLocation");
        return fileLocation;
    }

    private BooleanProperty isLocal;
    public void setIsLocal(Boolean value) { isLocalProperty().set(value); }
    public Boolean getIsLocal() { return isLocalProperty().get(); }
    public BooleanProperty isLocalProperty() {
        if (isLocal == null) isLocal = new SimpleBooleanProperty(this, "isLocal");
        return isLocal;
    }
}
