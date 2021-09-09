package abstract_factory.factory;

import abstract_factory.domain.productInfo.dao.ProductDao;
import abstract_factory.domain.productInfo.dao.oracle.ProductOracleDao;
import abstract_factory.domain.userInfo.dao.UserInfoDao;
import abstract_factory.domain.userInfo.dao.oracle.UserInfoOracleDao;

public class OracleDaoFactory implements DaoFactory {
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoOracleDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductOracleDao();
    }
}
