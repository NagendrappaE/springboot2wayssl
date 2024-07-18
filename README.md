############################################how to create root cer##################################
https://www.golinuxcloud.com/create-certificate-authority-root-ca-linux/

#private key 
 openssl genrsa -out 10.10.212.56.key.pem 4096
 
 #CSR
 openssl req -new -key 10.10.212.56.key.pem -out 10.10.212.56-1.csr -config san.cnf

copy the file 10.10.212.56-1.csr inside  myCA/rootCA/csr

#signing csr by CA
 openssl ca -config ~/myCA/rootCA/openssl.cnf  -in  csr/10.10.212.56-1.csr  -out certs/10.10.212.56-1.crt  -days 2650 -notext -batch

 or

 openssl x509 -req -days 2650 -in 10.10.212.56-2.csr -CA /home/nagendrappae/myCA/rootCA/certs/ca.crt -CAkey /home/nagendrappae/myCA/rootCA/private/ca.key -CAcreateserial -out 10.10.212.56-2.crt -extensions req_ext -extfile san.cnf


#######################################SSL domain cert================================================
[req]
distinguished_name = req_distinguished_name
req_extensions = req_ext
x509_extensions = v3_ca # The extensions to add to the self-signed cert
prompt = no

[req_distinguished_name]
C = IN
ST = Karnataka
L = Banglore
O = evolvus
OU = evolvus development
#CN = jboss.evolvus.io
CN=10.10.212.56

[req_ext]
subjectAltName = @alt_names

[v3_ca]
subjectAltName = @alt_names

[alt_names]
IP.1 = 10.10.212.56
#IP.2= 
#DNS.1 = jboss.evolvus.io

########################################SAN of 10.10.212.56###########################################

########################import public and CA public cert into truststore#############################
keytool -import  -importcert -alias paycorp -file ca.crt -keystore 127.0.0.1truststore.jks 

keytool -import -trustcacerts -alias paycorp -file ca.crt -keystore 127.0.0.1truststore.jks 

###################################################################################


# comand to run the spring boot jar:
-Djavax.net.debug=all -Djavax.net.ssl.keyStore=/home/nagendrappae/Downloads/127.0.0.1.jks -Djavax.net.ssl.keyStorePassword=Flux@123 -Djavax.net.ssl.trustStore=/home/nagendrappae/Downloads/10.10.212.56trustkeystore.jks -Djavax.net.ssl.trustStorePassword=Flux@123

javax.net.ssl.keyStore=  <client pfx into keystore>
javax.net.ssl.trustStore=  <server public cert and CA cert>
