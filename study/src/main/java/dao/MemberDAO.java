package dao;

import vo.LoginVO;
import vo.MemberVO;

import java.util.List;

public interface MemberDAO {
    public void write(MemberVO memberVO) throws Exception;
    public LoginVO select(LoginVO loginVO) throws Exception;
}
