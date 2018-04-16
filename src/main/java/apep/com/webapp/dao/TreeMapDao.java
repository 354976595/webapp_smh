package apep.com.webapp.dao;

import apep.com.webapp.po.TreasureMapEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by MACHENIKE on 2017/12/17.
 */
@Repository

public class TreeMapDao {

    @Autowired
    private HibernateTemplate ht2;
    public void setHt2(HibernateTemplate ht2) {
        this.ht2 = ht2;
    }


    public List<TreasureMapEntity> selectAllTreasureMap() {
        String hql = "from TreasureMapEntity";
        return (List<TreasureMapEntity>) ht2.find(hql);
    }
    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW )
    public void insert(TreasureMapEntity mapEntity) {
//       Session session= sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        transaction.begin();
        ht2.save(mapEntity);
//        transaction.commit();
//        session.close();

    }
}
