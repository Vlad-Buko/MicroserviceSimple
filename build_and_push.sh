mvn clean
mvn compile
mvn package

docker build . -t domaniewski/microservice-simple:1.0.0
docker push domaniewski/microservice-simple:1.0.0