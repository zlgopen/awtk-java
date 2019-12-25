all:
	scons -j2
	cd src/java && mvn package
	cd demos && mvn package

clean:
	scons -c
	rm -rf native
	cd src/java && mvn clean
	cd demos && mvn clean
