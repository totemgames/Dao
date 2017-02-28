package com.ttem.dao;

import com.ttem.data.SourceType;
import java.util.List;

public class Dao implements DaoInterface{

    private final static SourceType DEFAULT_SOURCE_TYPE = SourceType.DATA_BASE;

    private SourceType source;

    public Dao() {
        this.setSourceOfData(Dao.DEFAULT_SOURCE_TYPE);
    }

    public void setSourceOfData(final SourceType source) {
        this.source = source;
    }

    @Override
    public User selectUserById(final int id) {
        return source.getData().selectUserById(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return source.getData().selectAllUsers();
    }

    public static SourceType getDefaultSourceType() {
        return Dao.DEFAULT_SOURCE_TYPE;
    }

    public SourceType getSource() {
        return this.source;
    }
}
