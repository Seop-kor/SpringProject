package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.BoardService;
import vo.BoardVO;

import javax.inject.Inject;

@Controller
@RequestMapping("/board/*")
public class BoardController {

    @Inject
    BoardService service;

    @RequestMapping(value = "writeView",method = RequestMethod.GET)
    public String writeView() {
        return "/board/writeView";
    }

    @RequestMapping(value = "/board/write", method = RequestMethod.POST)
    public String write(BoardVO boardVO) throws Exception{
        service.write(boardVO);
        return "redirect:/";
    }

    @RequestMapping(value = "boardList", method = RequestMethod.GET)
    public String list(Model model) throws Exception{
        model.addAttribute("list",service.list());

        return "/board/boardList";
    }

}
