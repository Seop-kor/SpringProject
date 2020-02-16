package service;

import vo.BoardVO;

import java.util.List;

public interface BoardService {
    public void write(BoardVO boardVO) throws Exception;
    public List<BoardVO> list() throws Exception;
}
