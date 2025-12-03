package com.hulumulumulus.lab1.dto;

import com.hulumulumulus.lab1.entity.Note;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NoteResponse {

    private Integer id;

    private String title;

    private String content;

    private String author;

    public static NoteResponse fromNote(Note note) {
        return NoteResponse.builder()
                .id(note.getId())
                .title(note.getTitle())
                .content(note.getContent())
                .author(note.getAuthor())
                .build();
    }
}

