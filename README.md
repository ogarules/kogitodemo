# Pedidos demo

1. Dentro de extended/travels compilar : mvn clean package
2. Dentro de extended/visas compilar : mvn clean package
3. Dentro de extended/docker-compose correr : ./copyFiles.sh
4. Dentro de extended/docker-compose correr : docker compose up -d
5. Esperar 2 minutos a que termine de levantar todo
6. Dentro de extended/travels compilar : mvn clean package quarkus:dev
7. Dentro de extended/visas compilar : mvn clean package quarkus:dev
8. Esperar 2 minutos a que terminen de levantar los sitios customizados
9. Navegar a http://localhost:8380/TaskInbox
10. Navegar a http://localhost:8280/ProcessInstances/
11. Esperar que terminen de cargarse los sitios
12. Dentro de extended/docker-compose/taskassets/<id-generado>/META-INF/resources/fonts/ reemplazar el archivo que esta en raiz del repo llamdo taskConsoleLogo.svg
13. Dentro de extended/docker-compose/taskassets/<id-generado>/META-INF/vertx/web/ reemplazar el archivo que esta en raiz del repo llamdo favicon.ico
12. Dentro de extended/docker-compose/managementassets/<id-generado>/META-INF/resources/fonts/ reemplazar el archivo que esta en raiz del repo llamdo managementConsoleLogo.svg
13. Dentro de extended/docker-compose/managementassets/<id-generado>/META-INF/vertx/web/ reemplazar el archivo que esta en raiz del repo llamdo favicon.ico
14. Borrar cache del browser de http://localhost:8380/TaskInbox y http://localhost:8280/ProcessInstances/ o abrir de nuevo en otro browser
15. Sitio para crear fondeo http://localhost:8080/
16. Sitio para confirmacion de pago http://localhost:8090/

# Kogito Travel Agency - tutorial

## Description

During this workshop we will create a software system for a startup travel agency called Kogito Travel Agency. It
will be build incrementally where each version will be a separate folder.

Starting with base version that consists just one service that deals with entire Travel Agency business

## Travel agency solutions

NOTE: Look into individual versions to learn more on how to run it or what does it take to build it.

Each version is based on previous one so it allows people perform the implementation at their own pace
and to start any any place.

[Base travel agency service](basic) - deals with all the basic steps to book flight and hotel.
Consists of single service that has both business logic and decision logic included. 

[Travel agency and visa services with persistence](extended) - deals with all the basic steps to book flight and hotel.
Consists of two services that have both business logic and decision logic included. Preserves data between service restarts and requires Infinispan server to be available.

## Contribution

Everyone is encouraged to contribute to this tutorial by

* trying it out and providing feedback and ideas for improvement
* create new versions of the tutorial by starting from the last version
* blogging about it
* using it on conferences and workshops

## Deploying with Kogito Operator

In the [`operator`](operator) directory you'll find the custom resources needed to deploy this example on OpenShift with the [Kogito Operator](https://docs.jboss.org/kogito/release/latest/html_single/#chap_kogito-deploying-on-openshift).
