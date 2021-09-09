package abstract_factory.domain.productInfo.dao.oracle;

import abstract_factory.domain.productInfo.Product;
import abstract_factory.domain.productInfo.dao.ProductDao;

public class ProductOracleDao implements ProductDao {
    @Override
    public void insertProduct(Product product) {
        System.out.println("Insert into Oracle DB productID = " + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("Update into Oracle DB productID = " + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("Delete into Oracle DB productID = " + product.getProductId());
    }
}
