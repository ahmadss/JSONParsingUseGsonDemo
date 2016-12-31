package com.androidlokomedia.jsonparsingusegsondemo;

import java.util.List;

/**
 * Created by ahmad on 23/12/2016.
 */
public class Response {

    private List<MoviesBean> movies;

    public List<MoviesBean> getMovies() {
        return movies;
    }

    public void setMovies(List<MoviesBean> movies) {
        this.movies = movies;
    }

    public static class MoviesBean {
        /**
         * movie : Avengers
         * year : 2012
         * rating : 7.8
         * duration : 141 min
         * director : Joss Whedon
         * tagline : A new age begins
         * cast : [{"name":"Robert Downey Jr."},{"name":"Chris Evans"},{"name":"Mark Ruffalo"}]
         * image : http://jsonparsing.parseapp.com/jsonData/images/avengers.jpg
         * story : When Tony Stark and Bruce Banner try to jump-start a dormant peacekeeping program called Ultron, things go horribly wrong and it's up to Earth's Mightiest Heroes to stop the villainous Ultron from enacting his terrible plans.
         */

        private String movie;
        private int year;
        private double rating;
        private String duration;
        private String director;
        private String tagline;
        private String image;
        private String story;
        private List<CastBean> cast;

        public String getMovie() {
            return movie;
        }

        public void setMovie(String movie) {
            this.movie = movie;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public String getTagline() {
            return tagline;
        }

        public void setTagline(String tagline) {
            this.tagline = tagline;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getStory() {
            return story;
        }

        public void setStory(String story) {
            this.story = story;
        }

        public List<CastBean> getCast() {
            return cast;
        }

        public void setCast(List<CastBean> cast) {
            this.cast = cast;
        }

        public static class CastBean {
            /**
             * name : Robert Downey Jr.
             */

            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
