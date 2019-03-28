package reference.comparator;

import reference.domain.Film;
import reference.domain.Rating;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class FilmComparator implements Comparator<Film> {
    private Map<Film,List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.ratings = ratings;
    }

    private double average(Film film){
        int sum = 0;

        for(Rating rating: ratings.get(film))
            sum += rating.getValue();

        return (double)sum/(double)ratings.get(film).size();
    }

    @Override
    public int compare(Film f1, Film f2) {
        if(average(f1) == average(f2))
            return 0;
        return average(f2) - average(f1) > 0 ? 1 : -1;
    }
}
