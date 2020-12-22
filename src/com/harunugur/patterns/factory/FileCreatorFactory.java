package com.harunugur.patterns.factory;

public class FileCreatorFactory {

    public static FileCreator createFile(FileType fileType) {
        switch (fileType) {
            case EXCEL: return new EXCELCreator();
            case PDF: new PDFCreator();
            default: throw new UnsupportedOperationException();
        }
    }

}
