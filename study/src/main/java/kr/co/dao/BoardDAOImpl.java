package kr.co.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.vo.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	@Inject
	private SqlSession sqlSession;

	@Override
	public void write(BoardVO boardvo) throws Exception {
		sqlSession.insert("boardMapper.insert", boardvo);
		
	}
	
	
}