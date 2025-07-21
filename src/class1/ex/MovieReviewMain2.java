package class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        MovieReview mv1 = new MovieReview();
        mv1.title = "인셉션";
        mv1.review = "인생은 무한 루프";

        MovieReview mv2 = new MovieReview();
        mv2.title = "어바웃 타임";
        mv2.review = "인생 시간 영화!";

        MovieReview[] mv3 = {mv1, mv2};

        for (int i = 0; i < mv3.length; i++) {
            System.out.println("영화 제목: " + mv3[i].title + ", 리뷰: " + mv3[i].review);
        }
    }
}
