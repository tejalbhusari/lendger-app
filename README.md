Compilation 
mvn clean install -DskipTests -q assembly:single

execution command
java -jar geektrust.jar <absolute_path_to_input_file>

testing
mvn clean test

test reporting
mvn jacoco:report