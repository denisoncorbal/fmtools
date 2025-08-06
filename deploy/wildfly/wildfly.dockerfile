FROM quay.io/wildfly/wildfly

RUN --mount=type=secret,id=WILDFLY_ADMIN_USER,env=ADMIN_USER,required=true             \
    --mount=type=secret,id=WILDFLY_ADMIN_PASSWORD,env=ADMIN_PASSWORD,required=true     \
    $JBOSS_HOME/bin/add-user.sh -u ${ADMIN_USER} -p ${ADMIN_PASSWORD} --silent

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]