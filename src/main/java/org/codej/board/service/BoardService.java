package org.codej.board.service;

import org.codej.board.dto.BoardDTO;

import java.util.List;

public interface BoardService {

    List<BoardDTO> selectBoardList() throws Exception;

    void insertBoard(BoardDTO dto)throws Exception;

    BoardDTO selectBoardDetail(int bno) throws Exception;

    void updateBoard(BoardDTO dto)throws Exception;

    void deleteBoard(int bno)throws Exception;


}
