build:
	javac -cp src/main/java src/main/java/com/raulzaldana/pkg1/Main.java -d target/main

run:
	java -cp target/main com.raulzaldana.pkg1.Main

