cd bin
rmic detetive.model.Server
rmic detetive.controler.CGUI
start rmiregistry
java -Djava.security.policy="C:\policyfile.txt" detetive.Main
cd..