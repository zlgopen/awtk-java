all:
	scons -j2
	cd src/java && mvn package && mvn install:install-file -Dfile=../../bin/awtk.jar -DgroupId=org.awtk -DartifactId=awtk -Dversion=1.0 -Dpackaging=jar
	cd demos && mvn package

clean:
	scons -c
	rm -rf native
	cd src/java && mvn clean
	cd demos && mvn clean
