package abstractFactory.domain.userinfo.dao.oracle;

import abstractFactory.domain.userinfo.UserInfo;
import abstractFactory.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {


    @Override
    public void insertProduct(UserInfo userInfo) {
        System.out.println("insert into Oracle DB userId = " + userInfo.getUserId());
    }

    @Override
    public void updateProduct(UserInfo userInfo) {
        System.out.println("Update into Oracle DB userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteProduct(UserInfo userInfo) {
        System.out.println("Delete from Oracle DB userId = " + userInfo.getUserId());
    }

}
