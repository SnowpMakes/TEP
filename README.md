# TEP (Terminal Editing Program)

TEP is an easy terminal file editing program written in Java. It's part of me learning Git and I thought it might be a useful program later on.

### Downloads
TEP has no official release yet and is still in development. But you can clone this repository and build it for yourself using the following command (assuming you run a unix based system as the following is a bash command):
```bash
git clone https://github.com/SnowpMakes/TEP.git ./TEP2;
cd ./TEP2;
git fetch;
git checkout 1.0;
mkdir ./bin;
cd ./src;
javac -d ../bin ./io/snowp/tep/launch/TEPLaunch.java;
cd ../bin;
jar -cfvm ../TEP.jar ../src/META-INF/MANIFEST.mf .;
cd ..;
```
Or copy and paste the minified version:
```bash
git clone https://github.com/SnowpMakes/TEP.git ./TEP2;cd ./TEP2;git fetch;git checkout 1.0;mkdir ./bin;cd ./src;javac -d ../bin ./io/snowp/tep/launch/TEPLaunch.java;cd ../bin;jar -cfvm ../TEP.jar ../src/META-INF/MANIFEST.mf .;cd ..;
```
You can then run the produced TEP.jar file using the following command:
```bash
java -jar ./TEP.jar;
```
### Contributing
As much as I want to say "feel free to contribute", I can't. I'd like to have a working version up and running before people start contributing so that they kind of have the idea what they should do etc.
