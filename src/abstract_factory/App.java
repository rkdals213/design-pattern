package abstract_factory;

import abstract_factory.domain.productInfo.Product;
import abstract_factory.domain.productInfo.dao.ProductDao;
import abstract_factory.domain.userInfo.UserInfo;
import abstract_factory.domain.userInfo.dao.UserInfoDao;
import abstract_factory.factory.DaoFactory;
import abstract_factory.factory.MySqlDaoFactory;
import abstract_factory.factory.OracleDaoFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class App {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/factory/db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo("1234", "!@#$", "강민형");

        Product product = new Product("1234", "수건");

        DaoFactory daoFactory = null;
        if (dbType.equals("MYSQL")) {
            daoFactory = new MySqlDaoFactory();
        } else if (dbType.equals("ORACLE")) {
            daoFactory = new OracleDaoFactory();
        } else {
            System.out.println("error");
        }

        assert daoFactory != null;
        UserInfoDao userInfoDao = daoFactory.createUserInfoDao();
        System.out.println("UserInfo Transaction Start ====================================");
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
        System.out.println("UserInfo Transaction End ======================================");

        ProductDao productDao = daoFactory.createProductDao();
        System.out.println("Product Transaction Start =====================================");
        productDao.insertProduct(product);
        productDao.updateProduct(product);
        productDao.deleteProduct(product);
        System.out.println("Product Transaction End =======================================");
    }
}
