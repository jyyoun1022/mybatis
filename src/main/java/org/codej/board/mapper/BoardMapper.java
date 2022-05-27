package org.codej.board.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.codej.board.dto.BoardDTO;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<BoardDTO> selectBoardList() throws Exception;

    void insertBoard(BoardDTO dto) throws Exception;

    BoardDTO selectBoardDetail(int bno)throws Exception;

    void updateViewCount(int bno)throws Exception;

    void updateBoard(BoardDTO dto)throws Exception;

    void deleteBoard(int bno)throws Exception;
}
