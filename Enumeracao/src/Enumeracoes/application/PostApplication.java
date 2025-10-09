package Enumeracoes.application;

import Enumeracoes.entities.Comment;
import Enumeracoes.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PostApplication {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a Nice trip!");
        Comment c2 = new Comment("Wow that's awesome");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                12,
                "I am going to visit this wonderful country",
                "Travelling to New Zealand");
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }
}
