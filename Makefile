JDEPS = .:lib/jhealpix.jar:lib/nom-tam-fits-1.14.2.jar

run: build
	java -cp $(JDEPS) HelloHealpix

build:
	javac -cp $(JDEPS) HelloHealpix.java

clean:
	rm -f HelloHealpix.class
