package com.ttem.data;

public enum SourceType {

    DATA_BASE(DataBase.getInstance()),
    XML(Xml.getInstance()),
    WEB_SERVICE(WebService.getInstance());

    private Data data;

    SourceType(final Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }
}
