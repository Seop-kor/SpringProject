package service;

import vo.LoginVO;
import vo.MemberVO;

import java.util.List;

public interface MemberService {
    public void insert(MemberVO memberVO) throws Exception;
    public LoginVO loginAction(LoginVO loginVO) throws Exception;
}
