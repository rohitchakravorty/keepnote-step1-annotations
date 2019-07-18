package com.stackroute;

import com.stackroute.keepnote.model.Note;
import com.stackroute.keepnote.repository.NoteRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan("com.stackroute.keepnote")
@EnableWebMvc
public class DispatcherConfig {
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver vr = new InternalResourceViewResolver();
        vr.setPrefix("/WEB-INF/views/");
        vr.setSuffix(".jsp");
        return vr;
    }
    @Bean
    @Scope("prototype")
    public Note note()
    {
        Note note = new Note();
        return note;
    }
    @Bean
    @Scope("prototype")
    public NoteRepository noteRepository()
    {
        NoteRepository noteRepository = new NoteRepository();
        return noteRepository;
    }
}
