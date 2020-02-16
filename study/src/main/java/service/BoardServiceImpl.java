package service;

import dao.BoardDAO;
import org.springframework.stereotype.Service;
import vo.BoardVO;

import javax.inject.Inject;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{
    @Inject
    private BoardDAO dao;

    @Override
    public void write(BoardVO boardVO) throws Exception {
        dao.write(boardVO);
    }

    @Override
    public List<BoardVO> list() throws Exception{
        return dao.list();
    }
}
