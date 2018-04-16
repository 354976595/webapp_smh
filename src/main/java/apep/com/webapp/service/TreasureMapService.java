package apep.com.webapp.service;

import apep.com.webapp.dao.TreeMapDao;
import apep.com.webapp.po.TreasureMapEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by MACHENIKE on 2017/12/17.
 */
@Service
public class TreasureMapService implements Iservice {
    @Autowired
    private TreeMapDao treeMapDao;

    @Transactional
    @Override
    public List<TreasureMapEntity> selectAllTreasureMap() {
        System.out.println("new in selectAllTreasureMap");
        return treeMapDao.selectAllTreasureMap();
    }

    @Transactional(transactionManager = "hibernateTransactionManager", readOnly = false)
    @Override
    public void insertMap(TreasureMapEntity map) {
        treeMapDao.insert(map);
    }
}
