package org.codej.board.service;

import org.codej.board.dto.BoardDTO;

import java.util.List;

public interface BoardService {

    List<BoardDTO> selectBoardList() throws Exception;

    void insertBoard(BoardDTO dto)throws Exception;


}
