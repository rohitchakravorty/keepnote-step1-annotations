package com.stackroute;

import com.stackroute.keepnote.model.Note;
import com.stackroute.keepnote.repository.NoteRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
    @Bean
    @Scope("prototype")
    public Note note()
    {
        Note note = new Note();
        return note;
    }
    @Bean
    public NoteRepository noteRepository()
    {
        NoteRepository noteRepository = new NoteRepository();
        return noteRepository;
    }
}
