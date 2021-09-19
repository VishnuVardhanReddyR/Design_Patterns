package Com.CreationalPatterns.Builder.problem;

import Com.CreationalPatterns.Builder.Implementation.PresentationBuilder;
import Com.CreationalPatterns.Builder.Implementation.Slide;

public class MovieBuilder implements PresentationBuilder {
    private  Movie movie = new Movie();

    public Movie getMovie(){
        return movie;
    }
    @Override
    public void addSlide(Slide slide) {
        movie.addFrame(slide.getText(), 3);
    }
}
