package com.ttem;

import com.ttem.dao.Dao;
import com.ttem.data.DataBase;
import com.ttem.data.Xml;
import com.ttem.data.WebService;
import com.ttem.data.SourceType;
import com.ttem.data.Data;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDao {

    private Dao testDao;

    @Before
    public void setUp() {
        this.testDao = new Dao();
    }

    @Test
    public void setSourceOfDataWhenInputDataBase() {
        SourceType expectedSourceType = SourceType.DATA_BASE;
        Data expectedData = DataBase.getInstance();

        SourceType inputSourceType = SourceType.DATA_BASE;

        this.testDao.setSourceOfData(inputSourceType);

        SourceType actualSourceType = this.testDao.getSource();
        Data actualData = this.testDao.getSource().getData();

        Assert.assertSame(expectedSourceType, actualSourceType);
        Assert.assertSame(expectedData.getClass(), actualData.getClass());
    }

    @Test
    public void setSourceOfDataWhenInputXml() {
        SourceType expectedSourceType = SourceType.XML;
        Data expectedData = Xml.getInstance();

        SourceType inputSourceType = SourceType.XML;

        this.testDao.setSourceOfData(inputSourceType);

        SourceType actualSourceType = this.testDao.getSource();
        Data actualData = this.testDao.getSource().getData();

        Assert.assertSame(expectedSourceType, actualSourceType);
        Assert.assertSame(expectedData.getClass(), actualData.getClass());
    }

    @Test
    public void setSourceOfDataWhenInputWebService() {
        SourceType expectedSourceType = SourceType.WEB_SERVICE;
        Data expectedData = WebService.getInstance();

        SourceType inputSourceType = SourceType.WEB_SERVICE;

        this.testDao.setSourceOfData(inputSourceType);

        SourceType actualSourceType = this.testDao.getSource();
        Data actualData = this.testDao.getSource().getData();

        Assert.assertSame(expectedSourceType, actualSourceType);
        Assert.assertSame(expectedData.getClass(), actualData.getClass());
    }

    @Test
    public void setSourceOfDataDefault() {
        SourceType expectedSourceType = Dao.getDefaultSourceType();

        SourceType actualSourceType = this.testDao.getSource();

        Assert.assertSame(expectedSourceType, actualSourceType);
    }
}
