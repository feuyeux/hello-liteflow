export JAVA_HOME=/usr/local/opt/openjdk/libexec/openjdk.jdk/Contents/Home
mvn compile exec:java -Dexec.mainClass="org.feuyeux.workflow.HelloLiteFlow" -Dexec.args="Hello EasyFlows"