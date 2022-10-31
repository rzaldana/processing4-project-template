build:
	javac -cp src/main/java:src/main/libs/* src/main/java/com/raulzaldana/pkg1/Main.java -d target/main

run:
	java -cp target/main:src/main/libs/* com.raulzaldana.pkg1.Main

