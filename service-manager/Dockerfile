FROM ubuntu:14.04

MAINTAINER Keith Suderman, suderman@cs.vassar.edu

RUN apt-get -qq update && apt-get upgrade

ENV DEBIAN_FRONTEND=noninteractive
ENV DEB_JAVA_REPO="http://ppa.launchpad.net/webupd8team/java/ubuntu precise main" \
    DEB_POSTGRESQL_REPO="http://apt.postgresql.org/pub/repos/apt/ squeeze-pgdg main" \
	POSTGRES=postgresql-9.3 \
	JAVA=openjdk-7-jdk \
	TOMCAT_ROOT=/usr/share/tomcat \ 
	MANAGER=/usr/share/tomcat/service-manager \
	BPEL=/usr/share/tomcat/active-bpel

#RUN apt-get purge openjdk*
#RUN DEBIAN_FRONTEND=noninteractive apt-get install -y software-properties-common
#RUN add-apt-repository ppa:webupd8team/java
#RUN apt-get update
#RUN echo oracle-java7-installer shared/accepted-oracle-license-v1-1 select true | /usr/bin/debconf-set-selections
#RUN DEBIAN_FRONTEND=noninteractive apt-get install -y $JAVA
#RUN DEBIAN_FRONTEND=noninteractive apt-get install -y $POSTGRES


RUN apt-get install -y openjdk-7-jdk
RUN apt-get install -y $POSTGRES

ADD ./tomcat-root /usr/share/tomcat
ADD ./tomcat-users.xml $MANAGER/conf/tomcat-users.xml
ADD ./service_manager.xml $MANAGER/conf/Catalina/localhost/service_manager.xml

ADD ./tomcat-users-bpel.xml $BPEL/conf/tomcat-users.xml
ADD ./active-bpel.xml $BPEL/conf/Catalina/localhost/active-bpel.xml
ADD ./langrid.ae.properties $BPEL/bpr/langrid.ae.properties

ADD ./tomcat-startup.sh /etc/init.d/tomcat
ADD ./create_storedproc.sql /tmp/create_storedproc.sql

USER postgres
RUN createuser -S -D -R -P langrid
RUN createdb langrid -O langrid -E "UTF-8"
RUN createlang plpgsql langrid
RUN psql langrid < /tmp/create_storedproc.sql
RUN psql langrid -c "ALTER FUNCTION \"AccessStat.increment\"(character varying, character varying, character varying, character varying, character varying, timestamp without time zone, timestamp without time zone, integer, timestamp without time zone, integer, timestamp without time zone, integer, integer, integer, integer) OWNER TO $ROLENAME"

USER root
RUN /usr/sbin/useradd -d $TOMCAT_ROOT -c "Apache Tomcat" -m -s /bin/nologin tomcat

#CMD ["/etc/init.d/tomcat start"]


