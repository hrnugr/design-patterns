package com.harunugur.patterns.factory;

class PDFCreator implements FileCreator {
    @Override
    public String createFile(String content) {
        return "PDF File -> "+ content;
    }
}
