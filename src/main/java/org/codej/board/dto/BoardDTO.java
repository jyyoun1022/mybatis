package org.codej.board.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardDTO {

    private int bno;
    private String title;
    private String content;
    private int viewCount;
    private String writerId;
    private LocalDateTime regDate,modDate;
    private String updaterId;


}
