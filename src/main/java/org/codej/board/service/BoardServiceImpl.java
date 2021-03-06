package org.codej.board.service;

import lombok.RequiredArgsConstructor;
import org.codej.board.dto.BoardDTO;
import org.codej.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final BoardMapper boardMapper;

    @Override
    public List<BoardDTO> selectBoardList() throws Exception {
        return boardMapper.selectBoardList();
    }

    @Override
    public void insertBoard(BoardDTO dto) throws Exception {
         boardMapper.insertBoard(dto);
    }

    @Override
    public BoardDTO selectBoardDetail(int bno) throws Exception {
        boardMapper.updateViewCount(bno);
        BoardDTO board = boardMapper.selectBoardDetail(bno);

        return board;
    }

    @Override
    public void updateBoard(BoardDTO dto) throws Exception {
        boardMapper.updateBoard(dto);

    }

    @Override
    public void deleteBoard(int bno) throws Exception {
        boardMapper.deleteBoard(bno);
    }
}
