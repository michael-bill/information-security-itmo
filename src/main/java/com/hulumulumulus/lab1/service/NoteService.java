package com.hulumulumulus.lab1.service;

import com.hulumulumulus.lab1.dto.NoteResponse;
import com.hulumulumulus.lab1.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NoteService {

    private final NoteRepository noteRepository;

    public Page<NoteResponse> getNotes(Pageable pageable) {
        var notes = noteRepository.findAll(pageable);
        return notes.map(NoteResponse::fromNote);
    }
}

