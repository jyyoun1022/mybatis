package org.codej.board.controller;

import lombok.RequiredArgsConstructor;
import org.codej.board.dto.BoardDTO;
import org.codej.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/list")
    public void boardList(Model model) throws Exception {
        List<BoardDTO> list = boardService.selectBoardList();
        model.addAttribute("list",list);
    }
    @GetMapping("/register")
    public void register()throws Exception{

    }
    @PostMapping("/register")
    public String register(BoardDTO dto) throws Exception{
        boardService.insertBoard(dto);
        return "redirect:/board/list";
    }
    @GetMapping("/read")
    public void read(Model model, @RequestParam("bno") int bno)throws Exception{
        BoardDTO board = boardService.selectBoardDetail(bno);
        model.addAttribute("board",board);
    }
    @PostMapping("/modify")
    public String modify(BoardDTO dto)throws Exception{
        boardService.updateBoard(dto);
        return "redirect:/board/list";
    }
    @PostMapping("/delete")
    public String delete(int bno)throws Exception{
        boardService.deleteBoard(bno);
        return "redirect:/board/list";
    }
}
