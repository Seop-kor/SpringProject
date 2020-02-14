package service;

import dao.BoardDAO;
import org.springframework.stereotype.Service;
import vo.BoardVO;

import javax.inject.Inject;

@Service
public class BoardServiceImpl implements BoardService{
    @Inject
    private BoardDAO dao;

    @Override
    public void write(BoardVO boardVO) throws Exception {
        dao.write(boardVO);
    }
}
