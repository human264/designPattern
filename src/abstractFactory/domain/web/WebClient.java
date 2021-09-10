package abstractFactory.domain.web;

import abstractFactory.domain.factory.DaoFactory;
import abstractFactory.domain.factory.MySqlDaoFactory;
import abstractFactory.domain.factory.OracleDaoFactory;
import abstractFactory.domain.product.Product;
import abstractFactory.domain.product.dao.ProductDao;
import abstractFactory.domain.userinfo.UserInfo;
import abstractFactory.domain.userinfo.dao.UserInfoDao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class WebClient {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();

        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPassword("123");
        userInfo.setUserName("이순신");

        Product product = new Product();
        product.setProductId("0011AA");
        product.setProductName("TV");

        DaoFactory daoFactory = null;

        if(dbType.equals("MYSQL")) {
            daoFactory = new MySqlDaoFactory();
        }
        else if(dbType.equals("ORACLE")) {
            daoFactory = new OracleDaoFactory();
        }
        else {
            System.out.println("error");
        }

        UserInfoDao userInfoDao = daoFactory.createUserInfoDao();
        System.out.println("=======================UserInfo Transaction ====");
        userInfoDao.insertProduct(userInfo);
        userInfoDao.updateProduct(userInfo);
        userInfoDao.deleteProduct(userInfo);

        ProductDao productDao = daoFactory.createProductDao();
        System.out.println("=======================ProductDao Transaction ====");
        productDao.insertProduct(product);
        productDao.updateProduct(product);
        productDao.deleteProduct(product);








    }
}
