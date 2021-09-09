package abstract_factory.factory;

import abstract_factory.domain.productInfo.dao.ProductDao;
import abstract_factory.domain.userInfo.dao.UserInfoDao;

public interface DaoFactory {
    UserInfoDao createUserInfoDao();
    ProductDao createProductDao();
}
