# A Lappsgrid Service Manager with common services installed.

FROM ksuderman/ubuntu

MAINTAINER Keith Suderman, suderman@cs.vassar.edu

#ENV TOMCAT_ROOT=/var/lib/tomcat7 
	
#ADD ./tomcat-users.xml /usr/share/tomcat/service-manager/tomcat-users.xml
#ADD ./service_manager.xml $TOMCAT_ROOT/conf/Catalina/localhost/service_manager.xml
#ADD ./service_manager.war $TOMCAT_ROOT/webapps/service_manager.war

ADD ./tomcat-root /usr/share/tomcat
ADD ./tomcat-startup.sh /etc/init.d/tomcat
RUN chmod ug+x /etc/init.d/tomcat
RUN /usr/sbin/useradd -d /usr/share/tomcat -c "Apache Tomcat" -m -s /bin/nologin tomcat
RUN chown -R tomcat:tomcat /usr/share/tomcat
ADD ./create_storedproc.sql /tmp/create_storedproc.sql

USER postgres
RUN service postgresql start && \
    createuser -S -D -R langrid && \
    psql --command "ALTER USER langrid WITH PASSWORD 'langrid'" && \
    createdb langrid -O langrid -E "UTF-8" && \
    psql langrid < /tmp/create_storedproc.sql && \
    psql langrid -c "ALTER FUNCTION \"AccessStat.increment\"(character varying, character varying, character varying, character varying, character varying, timestamp without time zone, timestamp without time zone, integer, timestamp without time zone, integer, timestamp without time zone, integer, integer, integer, integer) OWNER TO langrid"
    

USER root
ADD ./startup.sh /usr/bin/startup
RUN chmod ug+x /usr/bin/startup
CMD [ "/usr/bin/startup" ]



