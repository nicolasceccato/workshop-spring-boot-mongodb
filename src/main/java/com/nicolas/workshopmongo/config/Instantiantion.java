package com.nicolas.workshopmongo.config;

import com.nicolas.workshopmongo.domain.Post;
import com.nicolas.workshopmongo.domain.User;
import com.nicolas.workshopmongo.dto.AuthorDTO;
import com.nicolas.workshopmongo.respositories.PostRepository;
import com.nicolas.workshopmongo.respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

@Configuration
public class Instantiantion implements CommandLineRunner {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;


    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));


        Post post1 = new Post(null, simpleDateFormat.parse("21/03/2018"), "Partiu viagem", "Vou viajar para SP. Abraços!", new AuthorDTO(maria));
        Post post2 = new Post(null, simpleDateFormat.parse("23/03/2018"), "Bom dia", "Acordei feliz hoje!", new AuthorDTO(maria));


        postRepository.saveAll(Arrays.asList(post1, post2));

    }
}
