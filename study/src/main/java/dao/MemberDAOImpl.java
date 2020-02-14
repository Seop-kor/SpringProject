package dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import vo.LoginVO;
import vo.MemberVO;

import javax.inject.Inject;
import java.util.List;

@Repository
public class MemberDAOImpl implements MemberDAO {
    @Inject
    SqlSession sqlSession;

    @Override
    public void write(MemberVO memberVO) throws Exception {
        sqlSession.insert("memberMapper.memberinsert", memberVO);
    }

    @Override
    public LoginVO select(LoginVO loginVO) throws Exception {
        return sqlSession.selectOne("memberMapper.loginAction",loginVO);
    }
}
