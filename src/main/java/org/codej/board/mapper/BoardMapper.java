package org.codej.board.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.codej.board.dto.BoardDTO;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<BoardDTO> selectBoardList() throws Exception;

    void insertBoard(BoardDTO dto) throws Exception;
}
