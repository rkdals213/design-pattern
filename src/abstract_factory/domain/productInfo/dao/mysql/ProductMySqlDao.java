package abstract_factory.domain.productInfo.dao.mysql;

import abstract_factory.domain.productInfo.Product;
import abstract_factory.domain.productInfo.dao.ProductDao;

public class ProductMySqlDao implements ProductDao {
    @Override
    public void insertProduct(Product product) {
        System.out.println("Insert into MySql DB productID = " + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("Update into MySql DB productID = " + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("Delete into MySql DB productID = " + product.getProductId());
    }
}
