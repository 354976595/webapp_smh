package apep.com.webapp.service;

import apep.com.webapp.po.TreasureMapEntity;

import java.util.List;

/**
 * Created by MACHENIKE on 2017/12/20.
 */
public interface Iservice {
    List<TreasureMapEntity> selectAllTreasureMap();

    void insertMap(TreasureMapEntity map);
}
