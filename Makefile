all:
	scons -j2
	cd src/java && mvn package
	cp -f src/java/target/awtk.jar bin
	cd demos && mvn package
	cp -f demos/target/awtk_demos.jar bin

clean:
	scons -c
	rm -rf native
	cd src/java && mvn clean
	cd demos && mvn clean
