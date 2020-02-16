package dao;

import vo.BoardVO;

import java.util.List;

public interface BoardDAO {
    public void write(BoardVO boardVO) throws Exception;
    public List<BoardVO> list() throws Exception;
}
