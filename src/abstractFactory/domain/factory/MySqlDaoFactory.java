package abstractFactory.domain.factory;

import abstractFactory.domain.product.dao.ProductDao;
import abstractFactory.domain.product.dao.mysql.ProductMySqlDao;
import abstractFactory.domain.userinfo.dao.UserInfoDao;
import abstractFactory.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import abstractFactory.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class MySqlDaoFactory implements DaoFactory {


    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMySqlDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductMySqlDao();
    }
}
