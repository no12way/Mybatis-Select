import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.pojo_.Clazz;
import org.pojo.Student;
import org.util.SqlSessionUtil;



public class Test_ {
    @Test
    public void testStudent(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        Student student = sqlSession.selectOne("clazzSelect.selectById", new Student(1l, null, null));
        System.out.println(student.getSname());
        System.out.println(student.getClazz().getCname());
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testStudent_(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        org.pojo_.Clazz clazz = sqlSession.selectOne("yiDuo.selectById",new Clazz(1001L,null,null));
        System.out.println(clazz.getCname());
        System.out.println(clazz.getStudents());
        sqlSession.commit();
        sqlSession.close();
    }
}
