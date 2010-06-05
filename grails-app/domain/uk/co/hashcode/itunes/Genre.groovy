package uk.co.hashcode.itunes

enum Genre {
	ALL(0),
	ALTERNATIVE(20),
	BLUES(2),
	CHILDREN(4),
	CLASSICAL(5),
	COMMEDY(3),
	COUNTRY(6),
	DANCE(17),
	ELECTRONIC(7),
	FITNESS_WORKOUT(50),
	HIPHOP_RAP(18),
	JAZZ(11),
	LATINO(12),
	POP(14),
	RB_SOUL(15),
	REGGAE(24),
	RELIGEOUS(22),
	ROCK(21),
	SOUNDTRACK(16),
	SPOKEN_WORD(50000061),
	WORLD(19)
	
	def id
	
	Genre(id){
		this.id = id
	}
}
