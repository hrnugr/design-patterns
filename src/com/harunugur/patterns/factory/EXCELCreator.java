package com.harunugur.patterns.factory;

class EXCELCreator implements FileCreator {

    @Override
    public String createFile(String content) {
        return "EXCEL File -> " + content;
    }
}
