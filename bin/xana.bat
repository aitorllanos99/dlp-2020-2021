@echo off
call mvn clean compile exec:java -Dexec.mainClass="es.uniovi.dlp.commandline.CLI" -Dexec.args="%1" > nul
call .\mapl\TextVM.exe %1.mp
