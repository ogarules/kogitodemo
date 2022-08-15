FROM infinispan/server:13.0.2.Final
COPY --chmod=0777 ./infinispan.xml /opt/infinispan/server/conf/infinispan-demo.xml
EXPOSE 11222 
CMD ["-c", "infinispan-demo.xml"]