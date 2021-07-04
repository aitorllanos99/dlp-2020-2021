set MAVEN_OPTS=--enable-preview

--- Generacion Codigo ----
- Para ver codigo en el terminal: 
mvn clean compile exec:java -Dexec.mainClass="es.uniovi.dlp.commandline.CLI" -Dexec.args="examples/codegeneration/simple.xana -a"

- Para obtener mp: 
mvn exec:java@cli -Dexec.args="examples/codegeneration/simple.xana"


- Ejecutar fichero 
  .\\mapl\\TextVM.exe examples/codegeneration/simple.xana.mp
