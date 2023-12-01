rm -rf compiled
mkdir compiled 
javac -d target -cp target:junit-platform-console-standalone-1.7.2.jar /Users/jeyas/LabReport5/Test.java 
java -jar junit-platform-console-standalone-1.7.2.jar --class-path compiled Test > output.txt
cat output.txt

