package abstract_factory.factory;

import abstract_factory.domain.productInfo.dao.ProductDao;
import abstract_factory.domain.productInfo.dao.mysql.ProductMySqlDao;
import abstract_factory.domain.userInfo.dao.UserInfoDao;
import abstract_factory.domain.userInfo.dao.mysql.UserInfoMySqlDao;

public class MySqlDaoFactory implements DaoFactory{
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMySqlDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductMySqlDao();
    }
}
