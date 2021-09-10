package abstractFactory.domain.factory;

import abstractFactory.domain.product.dao.ProductDao;
import abstractFactory.domain.userinfo.UserInfo;
import abstractFactory.domain.userinfo.dao.UserInfoDao;

public interface DaoFactory {


    UserInfoDao createUserInfoDao();
    ProductDao createProductDao();



}
