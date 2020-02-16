package dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import vo.BoardVO;

import javax.inject.Inject;
import java.util.List;

@Repository
public class BoardDAOImpl implements BoardDAO{
    @Inject
    private SqlSession sqlSession;

    @Override
    public void write(BoardVO boardVO) throws Exception {
        sqlSession.insert("boardMapper.insert", boardVO);
    }

    @Override
    public List<BoardVO> list() throws Exception{
        return sqlSession.selectList("boardMapper.list");
    }
}
