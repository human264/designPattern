package abstractFactory.domain.userinfo.dao;

import abstractFactory.domain.product.Product;
import abstractFactory.domain.userinfo.UserInfo;

public interface UserInfoDao {

    void insertProduct(UserInfo userInfo);
    void updateProduct(UserInfo userInfo);
    void deleteProduct(UserInfo userInfo);

}
