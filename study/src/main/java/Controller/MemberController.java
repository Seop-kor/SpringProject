package Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.MemberService;
import vo.LoginVO;
import vo.MemberVO;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

@Controller
public class MemberController {
    private Logger logger = LoggerFactory.getLogger(MemberController.class);

    @Inject
    MemberService service;

    @RequestMapping(value = "/loginout/signup", method = RequestMethod.GET)
    public String signup(){
        return "/loginout/signup";
    }

    @RequestMapping(value = "/loginout/signup.action", method = RequestMethod.POST)
    public String writesign(MemberVO memberVO) throws Exception{
        service.insert(memberVO);
        return "redirect:/";
    }

    @RequestMapping(value = "/loginout/login", method = RequestMethod.GET)
    public String login(){
        return "/loginout/login";
    }

    @RequestMapping(value = "/loginout/login.action", method = RequestMethod.POST)
    public String loginact(LoginVO loginVO, HttpServletRequest req, Model model) throws Exception{
        LoginVO resultVO;
        resultVO = service.loginAction(loginVO);
        if(resultVO != null && !resultVO.getMid().equals("") && !resultVO.getMpass().equals("")){
            logger.warn("성공");
            req.getSession().setAttribute("loginVO",resultVO);
            return "/board/writeView";
        }else{
            logger.warn("실패" + resultVO.getMpass());
            model.addAttribute("msg","로그인이 실패했습니다.");
            return "redirect:/info";
        }
    }

    @RequestMapping(value = "/loginout/logout.action", method = RequestMethod.POST)
    public String logout(LoginVO loginVO, HttpServletRequest req, Model model) throws Exception{
        req.getSession().removeAttribute("loginVO");
        return "redirect:/";
    }
}
