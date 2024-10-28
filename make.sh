scons -j2
cd src/java && mvn package && cd -
cp -fv src/java/target/awtk.jar bin
mvn install:install-file -Dfile=bin/awtk.jar -DgroupId=org.awtk -DartifactId=awtk -Dversion=1.0 -Dpackaging=jar

cd demos && mvn package && cd -
cp -fv demos/target/awtk_demos.jar bin
