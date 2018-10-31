package java.cn.itcast.jk.service.impl;

import cn.itcast.jk.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.cn.itcast.jk.dao.FactoryDao;
import java.cn.itcast.jk.domain.Factory;
import java.cn.itcast.jk.service.FactoryService;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class FactoryServiceImpl implements FactoryService {
    @Resource
    FactoryDao factoryDao;

    @Override
    public List<Factory> findPage(Page page) {
        return null;
    }

    @Override
    public List<Factory> find(Map paraMap) {
        return factoryDao.find(paraMap);
    }

    @Override
    public Factory get(Serializable id) {
        return null;
    }

    @Override
    public void insert(Factory Factory) {

    }

    @Override
    public void update(Factory Factory) {

    }

    @Override
    public void deleteById(Serializable id) {

    }

    @Override
    public void delete(Serializable[] ids) {

    }
}
