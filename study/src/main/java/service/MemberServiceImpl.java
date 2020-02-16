package service;

import common.LoginUtil;
import dao.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.LoginVO;
import vo.MemberVO;

import javax.inject.Inject;

@Service
public class MemberServiceImpl implements MemberService {

    @Inject
    MemberDAO dao;

    @Override
    public void insert(MemberVO memberVO) throws Exception {
        String encode_pass = LoginUtil.encryptPassword(memberVO.getMid(), memberVO.getMpass());
        memberVO.setMpass(encode_pass);
        memberVO.setMpass_check(encode_pass);
        dao.write(memberVO);
    }
    public LoginVO loginAction(LoginVO loginVO) throws Exception{
        String encode_pass = LoginUtil.encryptPassword(loginVO.getMid(), loginVO.getMpass());
        loginVO.setMpass(encode_pass);
        return dao.select(loginVO);
    }
}
