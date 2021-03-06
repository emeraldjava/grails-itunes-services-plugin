package uk.co.hashcode.itunes

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class GenreTests {
	
	@Before
    void setUp() {

	}

	@After
    void tearDown() {

	}

	@Test
    void testEnumIds() {
    	assert Genre.ALL.id == 0
    	assert Genre.ALTERNATIVE.id == 20
    	assert Genre.BLUES.id == 2
    	assert Genre.CHILDREN.id == 4
    	assert Genre.CLASSICAL.id == 5
    	assert Genre.COMEDY.id == 3
    	assert Genre.COUNTRY.id == 6
    	assert Genre.DANCE.id == 17
    	assert Genre.ELECTRONIC.id == 7
    	assert Genre.FITNESS_WORKOUT.id == 50
    	assert Genre.HIPHOP_RAP.id == 18
    	assert Genre.JAZZ.id == 11
    	assert Genre.LATINO.id == 12
    	assert Genre.POP.id == 14
    	assert Genre.RB_SOUL.id == 15
    	assert Genre.REGGAE.id == 24
    	assert Genre.RELIGIOUS.id == 22
    	assert Genre.ROCK.id == 21
    	assert Genre.SOUNDTRACK.id == 16
    	assert Genre.SPOKEN_WORD.id == 50000061
    	assert Genre.WORLD.id == 19
    	
    }
}
