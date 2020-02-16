package kr.co.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.service.BoardService;
import kr.co.vo.BoardVO;

@Controller
@RequestMapping("/board/*")
public class BoardController {
//	private static final Logger Logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	BoardService service;
	
	//화면 view
	@RequestMapping(value="writeView",method=RequestMethod.GET)
	public void writeView() throws Exception{
//		Logger.info("writeView");
	}
	
	@RequestMapping(value="/board/write", method=RequestMethod.POST)
	public String write(BoardVO boardVO) throws Exception{
//		Logger.info("write");
		service.write(boardVO);
		return "redirect:/";
	}
}
