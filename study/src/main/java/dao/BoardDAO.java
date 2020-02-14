package dao;

import vo.BoardVO;

public interface BoardDAO {
    public void write(BoardVO boardVO) throws Exception;
}
