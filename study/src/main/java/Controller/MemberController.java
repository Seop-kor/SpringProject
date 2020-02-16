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
        LoginVO result = service.loginAction(loginVO);
        if(result != null){
            req.getSession().setAttribute("loginVO", result);
            return "forward:/";
        }else{
            return "redirect:/loginout/login";
        }
    } // 반환형 String으로

    @RequestMapping(value = "/loginout/logout.action", method = RequestMethod.GET)
    public String logout(LoginVO loginVO, HttpServletRequest req, Model model) throws Exception{
        req.getSession().removeAttribute("loginVO");
        return "redirect:/";
    }
}
