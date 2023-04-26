/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void testAddReview() {
        Place place = new Place("Pizza Palace", 2);
        Review review = new Review("Great pizza!", "Alice", 5, place);
        assertEquals(1, place.getReviews().size());
        assertEquals(review, place.getReviews().get(0));
        System.out.println("testAddReview passed");

    }
    @Test
    public void testAddDuplicateReview() {
        Place place = new Place("Pizza Palace", 2);
        Review review1 = new Review("Great pizza!", "Alice", 5, place);
        Review review2 = new Review("Bad pizza!", "Alice", 1, place);
        assertEquals(1, place.getReviews().size());
        assertEquals(review1, place.getReviews().get(0));
        assertNotEquals(review2, place.getReviews().get(0));
        System.out.println("testAddDuplicateReview passed");
    }

    @Test
    public void testCalculateAverageRating() {
        Place place = new Place("Pizza Palace", 2);
        Review review1 = new Review("Great pizza!", "Alice", 5, place);
        Review review2 = new Review("Decent pizza.", "Bob", 3, place);
        Review review3 = new Review("Bad pizza!", "Charlie", 1, place);
        assertEquals(3, place.getReviews().size());
        assertEquals((5 + 3 + 1) / 3.0, place.getAverageRating());
        System.out.println("testCalculateAverageRating passed");
    }

}
