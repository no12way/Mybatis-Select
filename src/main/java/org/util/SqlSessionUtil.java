package org.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class SqlSessionUtil {
    //构造私有防止被实例化
    private SqlSessionUtil(){}
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try{
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static SqlSession openSqlSession(){
        return sqlSessionFactory.openSession();
    }

}

