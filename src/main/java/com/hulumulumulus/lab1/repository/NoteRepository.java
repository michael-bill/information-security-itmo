package com.hulumulumulus.lab1.repository;

import com.hulumulumulus.lab1.entity.Note;
import io.micrometer.common.lang.NonNullApi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

@NonNullApi
public interface NoteRepository extends JpaRepository<Note, Integer> {

    Page<Note> findAll(Pageable pageable);
}

