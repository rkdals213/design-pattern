package abstract_factory.domain.productInfo.dao;

import abstract_factory.domain.productInfo.Product;

public interface ProductDao {
    void insertProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Product product);
}
