mvn clean compile exec:java -Dexec.mainClass="es.uniovi.dlp.commandline.CLI" -Dexec.args="$1" > /dev/null
mono ./mapl/TextVM.exe $1.mp
