package uk.co.hashcode.itunes

enum Country {
	AUSTRALIA(143460),
	AUSTRIA(143445),
	BELGIUM(143446),
	CANADA(143455),
	DENMARK(143458),
	FINLAND(143447),
	FRANCE(143442),
	GERMANY(143443),
	GREECE(143448),
	IRELAND(143449),
	ITALY(143450),
	JAPAN(143462),
	LUXEMBOURG(143451),
	MEXICO(143468),
	NETHERLANDS(143452),
	NEW_ZEALAND(143461),
	NORWAY(143457),
	PORTUGAL(143453),
	SPAIN(143454),
	SWEDEN(143456),
	SWITZERLAND(143459),
	UK(143444),
	USA(143441)

	def id
	
	Country(int id){
		this.id = id
	}
	
	String toString(){ name().toLowerCase() }
	
}