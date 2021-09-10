package abstractFactory.domain.userinfo.dao.mysql;

import abstractFactory.domain.product.Product;
import abstractFactory.domain.product.dao.ProductDao;
import abstractFactory.domain.userinfo.UserInfo;
import abstractFactory.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {


    @Override
    public void insertProduct(UserInfo userInfo) {
        System.out.println("insert into MySQL DB userId = " + userInfo.getUserId());
    }

    @Override
    public void updateProduct(UserInfo userInfo) {
        System.out.println("Update into MySQL DB userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteProduct(UserInfo userInfo) {
        System.out.println("Delete from MySQL DB userId = " + userInfo.getUserId());
    }

}
