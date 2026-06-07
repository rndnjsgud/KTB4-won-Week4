package com.example.KTB_assignment_week4.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    Long boardId;
    String title;
    String content;
    List<String> contentPicture;
    LocalDateTime registerDate;
    Long authorId;
    Integer numberOfLikes;
    Integer numberOfViews;
    Integer numberOfComments;
    List<Long> commentsId;

}
